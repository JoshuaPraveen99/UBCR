package com.uc.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uc.businessbean.DropOffBean;
import com.uc.businessbean.LoginBean;
import com.uc.businessbean.PickUpBean;
import com.uc.businessbean.ProviderLoginBean;
import com.uc.businessbean.ProviderRegBean;
import com.uc.businessbean.TrailBean;
import com.uc.service.PopulateLocationService;
import com.uc.web.client.ProviderLoginClient;
import com.uc.web.client.ProviderRegClient;

@Controller
public class ProviderController {

	@Autowired 
	ProviderLoginClient ps;
	
	@Autowired
	ProviderRegClient rc;
	
	@Autowired
	PopulateLocationService ls;
	Map<Integer,String> map =  new HashMap<Integer,String>(); 

	//providing bean for loginPage
	@RequestMapping(value = "/showProviderLoginPage")
	public ModelAndView showLoginPage() {
		return new ModelAndView("ProviderLogin", "providerLoginBean", new ProviderLoginBean());
	}

	// validate the user credentials
	@RequestMapping(value="/ValidateProviderLogin")
	public ModelAndView validateLogin(@Valid @ModelAttribute("providerLoginBean") ProviderLoginBean loginBean, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		if(result.hasErrors()) {
			mv.setViewName("ProviderLogin");
		}
		else {
			System.out.println(loginBean.getUserName());
			String pass = loginBean.getPassword();
			LoginBean pbean=ps.hitGetUserDetails(loginBean);
			String check="xxx";
			boolean b=(check.equals(pbean.getUserName()));
			System.out.println(b);
			 if(pbean!=null && b==false && pass.equals(pbean.getPassword())) {
				 mv.setViewName("LoginSuccess");
				 mv.addObject("message", "Welcome "+pbean.getUserName());
			 }
			 else {
				 mv.setViewName("ProviderLogin");
				 mv.addObject("message", "Please check the credentials you have entered");
			 }
		}
		return mv;
	}
	
	//providing bean for providerReg page
	@RequestMapping(value="/showProviderRegPage")
	public ModelAndView showProviderRegPage() {
		System.out.println("show provider working");
		return new ModelAndView("ProviderRegistration","regBean",new ProviderRegBean());
	}
	
	//adding new provider to the database
	@RequestMapping(value="/addNewProvider")
	public ModelAndView addNewProvider(@ModelAttribute("regBean")ProviderRegBean rbean) {
		ModelAndView mv = new ModelAndView();
		System.out.println("Controller working");
		System.out.println(rbean);
		ProviderRegBean bean = rc.addNewProvider(rbean);
		if(bean!=null) {
			mv.setViewName("RegistrationSuccess");
			mv.addObject("message","A new provider has been registered successfully");
		}
		return mv;	
	}
	
	//populating the pickup location
	@ModelAttribute("pickUp_Location")
	public Map<Integer,String> populatePickUp() {
		ModelAndView mv = new ModelAndView();
		List<PickUpBean> list = new ArrayList<PickUpBean>();
		list=ls.populatePickUpLocations();
		System.out.println(list.toString());
		map=ls.populatePickUpLocations().stream().collect(Collectors.toMap(PickUpBean::getKey
				, PickUpBean::getPickUpLocations));
		return map;
	}
	
	@RequestMapping(value="/check_dropOff")
	//@ModelAttribute("DropOff_Location")
	public List<DropOffBean> populateDropOff() {
		//ModelAndView mv = new ModelAndView();
		List<DropOffBean> list = new ArrayList<DropOffBean>();
		/*Map<Integer,String> map = ls.populateDropOffLocations().stream().collect(Collectors.toMap(DropOffBean::getKey
				,DropOffBean::getDropOffLocation));
		*/
		System.out.println("Controller works");
		list=ls.populateDropOffLocations();
		//mv.addObject(map);
		//mv.setViewName("index");
		return list;
	}
	
	@RequestMapping(value="/trailCheck")
	public ModelAndView checkTrail() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("location",new TrailBean());
		mv.setViewName("Trailjsp");
		return mv;
	}
	
	@RequestMapping(value="bookRide")
	public void bookRide(@ModelAttribute("pickUp_Location") TrailBean trailBean) {
		System.out.println("trailBean");
		trailBean.setPickUp_Location(map.get(trailBean.getKey()));
		System.out.println(trailBean.getPickUp_Location());
		System.out.println("Trail Success");
	}
	
}