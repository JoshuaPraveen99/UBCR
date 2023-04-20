package com.uc.web.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	double pickupTime=0.0;

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
		
		@RequestMapping(value="/validateSession")
		public String validateSession(HttpSession session, HttpServletRequest request) {
		
			//String contextPath = request.getContextPath();
			System.out.println("control enters validateSession" );
			if(session.getAttribute("user")!=null) {
				return "redirect:/bookRide.html";
			}else {
				return "redirect:/showLoginPage.html";
			}
			
		}
		public ModelAndView bookRide(@ModelAttribute("formlocations") GetFormLocationsBean formLocationsBean, 
						HttpSession session) {
	    	ModelAndView mv=new ModelAndView();
	    		System.out.println("bookRide works!!!");
				System.out.println(formLocationsBean);
				formLocationsBean.setPickUpLocation(pickUpmap.get(formLocationsBean.getPickUpKey()));
				formLocationsBean.setDropOffLocation(dropOffmap.get(formLocationsBean.getDropOffKey()));
				System.out.println(formLocationsBean);
				pickup=formLocationsBean.getPickUpLocation();
				destination=formLocationsBean.getDropOffLocation();
				session.setAttribute("pickup", pickup);
				session.setAttribute("destination", destination);
				LocalTime time = LocalTime.now();
			    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H.mm");
			    double pickupTime = Double.parseDouble(time.format(formatter));
			    List<Taxi> finalTaxi=rs.bookaRide(pickup,destination,pickupTime);
			    System.out.println(finalTaxi);
			    //System.out.println(finalTaxi.getCarType()+" "+finalTaxi.getDriverName());
				System.out.println("Trail Success");
				mv.addObject("finalTaxi",finalTaxi);
				mv.setViewName("RideSelect");
			return mv;
		}
	    @RequestMapping(value="/beanDetails")
	    public ModelAndView bookTaxi(@RequestParam("id")int id, HttpSession session) {
	    	System.out.println("Controller is working");
			ModelAndView mv=new ModelAndView();
			System.out.println(id);
			Taxi bookedTaxi=rs.confirmTaxi(id,String.valueOf(session.getAttribute("pickup")),String.valueOf(session.getAttribute("destination")));
			mv.addObject(bookedTaxi);
			mv.setViewName("Confirmationpage");
	    	return mv;
	    	
	    }
}
