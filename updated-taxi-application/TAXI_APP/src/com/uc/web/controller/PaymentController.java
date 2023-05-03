package com.uc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaymentController {
	@RequestMapping(value="Payment")
	public ModelAndView paymentProcess() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("PaymentPage");
		return mv;
	}

}
