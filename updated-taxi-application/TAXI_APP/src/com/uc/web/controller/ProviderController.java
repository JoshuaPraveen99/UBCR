package com.uc.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uc.businessbean.LoginBean;
import com.uc.businessbean.ProviderRegBean;
import com.uc.businessbean.RegistrationBean;
import com.uc.web.client.ProviderLoginClient;

@Controller
public class ProviderController {

	@Autowired ProviderLoginClient ps;

	//providing bean for loginPage
	@RequestMapping(value = "/showProviderLoginPage")
	public ModelAndView showLoginPage() {
		return new ModelAndView("ProviderLogin", "providerLoginBean", new LoginBean());
	}

	// validate the user credentials
	@RequestMapping(value="/ValidateProviderLogin")
	public ModelAndView validateLogin(@Valid @ModelAttribute("providerLoginBean") LoginBean loginBean, BindingResult result) {
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
		return new ModelAndView("ProviderRegistration","regBean",new ProviderRegBean());
	}
	
	//adding new provider to the db
	@RequestMapping(value="/addNewProvider")
	public ModelAndView addNewProvider(@Valid @ModelAttribute("regBean")RegistrationBean rbean, BindingResult result) {
		return null;
		
		
	}
	
	
}