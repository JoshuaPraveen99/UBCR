package com.uc.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.uc.businessbean.LoginBean;
import com.uc.businessbean.ProviderRegBean;
import com.uc.businessbean.RegistrationBean;
import com.uc.entity.LoginEntity;
import com.uc.web.client.CustomerLoginClient;
import com.uc.web.client.CustomerRegistrationClient;


@Controller
public class CustomerController {
	@Autowired CustomerLoginClient ls;
	@Autowired CustomerRegistrationClient rs;
	//@Autowired JavaMailSender javaMailSender;
	RegistrationBean registrationBean= new RegistrationBean();

	
	@RequestMapping(value = "/ShowLoginPage")
	public ModelAndView loadLoginForm() {
		return new ModelAndView("Login","loginBean", new LoginBean());
	}
	/*@RequestMapping(value = "/ValidateLogin")
	public ModelAndView load(@Valid @ModelAttribute("loginBean")LoginBean loginBean, BindingResult bindingresult) throws Exception {
		ModelAndView mv= new ModelAndView();
		if (bindingresult.hasErrors())
			mv.setViewName("Login");
		else {
			String us = loginBean.getUserName();
			String pw = loginBean.getPassword();
			LoginEntity le = ls.validLogin(us);


			if (le != null && le.getPassWord().equals(pw)) {
				mv.setViewName("RegistrationSuccess");
				
			} else {
				System.out.println("not correct");
				mv.setViewName("Login");
				mv.addObject("message", "Please Enter the valid credentials");
			}
		}
		return mv;}*/
	public ModelAndView validateLogin(@Valid @ModelAttribute("loginBean") LoginBean loginBean, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		if(result.hasErrors()) {
			mv.setViewName("Login");
		}
		else {
			System.out.println(loginBean.getUserName());
			String pass = loginBean.getPassword();
			LoginBean pbean=ls.hitGetUserDetails(loginBean);
			String check="xxx";
			boolean b=(check.equals(pbean.getUserName()));
			System.out.println(b);
			 if(pbean!=null && b==false && pass.equals(pbean.getPassword())) {
				 mv.setViewName("LoginSuccess");
				 mv.addObject("message", "Welcome "+pbean.getUserName());
			 }
			 else {
				 mv.setViewName("Login");
				 mv.addObject("message", "Please check the credentials you have entered");
			 }
		}
		return mv;
	}

	
	
	@RequestMapping(value="/customerRegistration")
	public ModelAndView loadRegistraionPage() {
		return new ModelAndView("customerRegistration", "registrationBean", new RegistrationBean() );
		
	}
		

	/*@RequestMapping(value = "/RegistrationSuccess", method=RequestMethod.POST)
	public String loadRegistrationSuccess(
			@RequestParam("C_NAME") String C_NAME,
			@RequestParam(value="Contact") String Contact,
			@RequestParam("Address")String Address,
			@RequestParam("email")String email,
			@RequestParam("username")String username,
			@RequestParam("password")String password,
			@RequestParam("Photo")MultipartFile Photo) throws Exception
	{
		//ModelAndView mv= new ModelAndView();

		RegistrationBean registrationBean1=new RegistrationBean();
        registrationBean.setC_NAME(C_NAME);
        registrationBean.setContact(Contact);
        registrationBean.setAddress(Address);
        registrationBean.setEmail(email);
        registrationBean.setUsername(username);
        registrationBean.setPassword(password);
        registrationBean.setPhoto(Photo.getBytes());


		System.out.println(registrationBean.getC_NAME());
		System.out.println(registrationBean.getEmail());
		System.out.println(registrationBean.getPhoto());
		//mv.setViewName("RegistrationSuccess");
		//String otp=generateOTP();
		//sendEmailOTP(email,otp);
		//sendSMSOTP(Contact,otp);
		registrationBean=rs.saveDetails(registrationBean);
		return "RegistrationSuccess";
		
	}*/
	/*private String generateOTP() {
		return String.valueOf((int)(Math.random()*900000)+100000);
	}
	private void sendEmailOTP(String email,String otp) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(email);
		message.setSubject("OTP for your application");
		message.setText("Your OTP is: + otp");
		javaMailSender.send(message);
	}*/
	//adding new provider to the database
		@RequestMapping(value="/addNewCustomer" ,method=RequestMethod.POST)
		public ModelAndView addNewProvider(@ModelAttribute("registrationBean")RegistrationBean rbean) {
			ModelAndView mv = new ModelAndView();
			System.out.println("Controller working");
			System.out.println(rbean);
			RegistrationBean bean = rs.addNewCustomer(rbean);
			if(bean!=null) {
				mv.setViewName("RegistrationSuccess");
				mv.addObject("message","Your details have been regsitered successfully,Explore our services by logging in.");
			}
			return mv;	
		}


	
}
