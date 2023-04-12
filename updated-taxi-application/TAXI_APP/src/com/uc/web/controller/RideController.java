package com.uc.web.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uc.businessbean.DropOffBean;
import com.uc.businessbean.GetFormLocationsBean;
import com.uc.businessbean.PickUpBean;
import com.uc.businessbean.Taxi;
import com.uc.service.PopulateLocationService;
import com.uc.service.RideBookingService;

@Controller
public class RideController {
	List<Taxi>Taxis=new ArrayList<>();
	
	@Autowired
	PopulateLocationService ls;
	@Autowired
	RideBookingService rs;
	Map<Integer,String> pickUpmap =  new HashMap<Integer,String>();
	Map<Integer,String> dropOffmap =  new HashMap<Integer,String>();
	String pickup;
	String destination;

	//populating the pickup location
		@ModelAttribute("pickUp_Location")
		public Map<Integer,String> populatePickUp() {
			List<PickUpBean> list = new ArrayList<PickUpBean>();
			list=ls.populatePickUpLocations();
			
			System.out.println(list.toString());
			System.out.println("**************");
			pickUpmap=ls.populatePickUpLocations().stream().collect(Collectors.toMap(PickUpBean::getKey
					, PickUpBean::getPickUpLocations));
			System.out.println("!!!!!!!!!!!!! pickup map");
			System.out.println(pickUpmap.get(3));
			return pickUpmap;
		}
		
		//populating the dropOff location
				@ModelAttribute("dropOff_Location")
				public Map<Integer,String> populatedropOff() {
					List<DropOffBean> list = new ArrayList<DropOffBean>();
					list=ls.populateDropOffLocations();
					
					System.out.println(list.toString());
					System.out.println("**************");
					dropOffmap=ls.populateDropOffLocations().stream().collect(Collectors.toMap(DropOffBean::getKey
							, DropOffBean::getDropOffLocation));
					System.out.println("!!!!!!!!!!!!! dropoff map");
					System.out.println(dropOffmap.get(3));
					return dropOffmap;
				}
		
		/*@RequestMapping(value="/check_dropOff")
		//@ModelAttribute("DropOff_Location")
		public List<DropOffBean> populateDropOff() {
			//ModelAndView mv = new ModelAndView();
			List<DropOffBean> list = new ArrayList<DropOffBean>();
			/*Map<Integer,String> map = ls.populateDropOffLocations().stream().collect(Collectors.toMap(DropOffBean::getKey
					,DropOffBean::getDropOffLocation));
			
			System.out.println("Controller works");
			list=ls.populateDropOffLocations();
			//mv.addObject(map);
			//mv.setViewName("index");
			return list;
		}*/
		
		@RequestMapping(value="/populateLocations")
		public ModelAndView populateLocations() {
			System.out.println("populate location works");
			ModelAndView mv = new ModelAndView();
			mv.addObject("formlocations",new GetFormLocationsBean());
			mv.setViewName("index");
			return mv;
		}
		
		@RequestMapping(value="/bookRide")
		public void bookRide(@ModelAttribute("formlocations") GetFormLocationsBean formLocationsBean) {
			System.out.println("bookRide works!!!");
			System.out.println(formLocationsBean);
			formLocationsBean.setPickUpLocation(pickUpmap.get(formLocationsBean.getPickUpKey()));
			formLocationsBean.setDropOffLocation(dropOffmap.get(formLocationsBean.getDropOffKey()));
			System.out.println(formLocationsBean);
			pickup=formLocationsBean.getPickUpLocation();
			destination=formLocationsBean.getDropOffLocation();
			LocalTime time = LocalTime.now();
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H.mm");
		    double pickupTime = Double.parseDouble(time.format(formatter));
		    rs.bookaRide(pickup,destination,pickupTime);
		    System.out.println(Taxis);
			System.out.println("Trail Success");
		}
}
