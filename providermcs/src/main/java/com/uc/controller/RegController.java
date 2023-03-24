package com.uc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uc.businessbean.RegBean;
import com.uc.service.RegService;

@RestController
public class RegController {
	
	@Autowired
	RegService rs;
	
	@RequestMapping(value="/provider/register",consumes=MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<RegBean> addUser(@RequestBody RegBean regBean){
		System.out.println(regBean);
		RegBean bean = new RegBean();
		bean=rs.addNewProvider(regBean);
		return new ResponseEntity<RegBean>(bean,HttpStatus.OK);
		
	}

}
