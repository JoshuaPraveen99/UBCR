package com.uc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uc.businessbean.LoginBean;
import com.uc.service.LoginService;

@RestController
public class LoginController {
	@Autowired 
	LoginService ls;
	
	@RequestMapping(value="login", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LoginBean> processEntity(@RequestBody LoginBean entity) {
		LoginBean lbean=new LoginBean();
		System.out.println(entity);
		lbean=ls.getLoginDetails(entity);
		System.out.println(lbean.getPassword());
		return new ResponseEntity<LoginBean>(lbean, HttpStatus.OK);
    }
	


}
