package com.uc.web.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.uc.businessbean.LoginBean;
import com.uc.businessbean.ProviderLoginBean;
import com.uc.businessbean.ProviderRegBean;
import com.uc.businessbean.RegistrationBean;
import com.uc.entity.LoginEntity;
import com.uc.service.LoginService;
import com.uc.service.RegistrationService;


@Controller
public class LoginController {
	@Autowired LoginService ls;
	@Autowired RegistrationService rs;
	@Autowired JavaMailSender javaMailSender;
	RegistrationBean registrationBean= new RegistrationBean();

	
	@RequestMapping(value = "/ShowLoginPage")
	public ModelAndView loadLoginForm() {
		return new ModelAndView("Login","loginBean", new LoginBean());
	}
	@RequestMapping(value = "/ValidateLogin")
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
		return mv;
	}
	
	
	@RequestMapping(value="/customerRegistration")
	public ModelAndView loadRegistraionPage() {
		return new ModelAndView("Registration", "registrationBean", new RegistrationBean() );
		
	}
		

	@RequestMapping(value = "/RegistrationSuccess", method=RequestMethod.POST)
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
		String otp=generateOTP();
		sendEmailOTP(email,otp);
		//sendSMSOTP(Contact,otp);
		registrationBean=rs.saveDetails(registrationBean);
		return "RegistrationSuccess";
		
	}
	private String generateOTP() {
		return String.valueOf((int)(Math.random()*900000)+100000);
	}
	private void sendEmailOTP(String email,String otp) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(email);
		message.setSubject("OTP for your application");
		message.setText("Your OTP is: + otp");
		javaMailSender.send(message);
	}
	


	
}
