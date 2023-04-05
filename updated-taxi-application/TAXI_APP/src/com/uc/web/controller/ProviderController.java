package com.uc.web.controller;

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
	public ModelAndView populatePickUp() {
		ModelAndView mv = new ModelAndView();
		Map<Integer,String> map=ls.populatePickUpLocations().stream().collect(Collectors.toMap(PickUpBean::getKey
				, PickUpBean::getPickUpLocations));
		mv.addObject(map);
		System.out.println(map);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="check_pickup")
	@ModelAttribute("DropOff_Location")
	public ModelAndView populateDropOff() {
		ModelAndView mv = new ModelAndView();
		Map<Integer,String> map = ls.populateDropOffLocations().stream().collect(Collectors.toMap(DropOffBean::getKey
				,DropOffBean::getDropOffLocation));
		mv.addObject(map);
		mv.setViewName("index");
		return mv;
	}
	
	
}