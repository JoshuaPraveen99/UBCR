package com.uc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uc.businessbean.CustomerRegistrationBean;
import com.uc.service.RegistrationService;

@RestController
public class RegistrationController {
	
	@Autowired
	RegistrationService rs;

	
	@PostMapping(value="/provider/register",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerRegistrationBean> addUser(@RequestBody CustomerRegistrationBean regBean) throws Exception{
		System.out.println(regBean.getAddress());
		CustomerRegistrationBean bean = new CustomerRegistrationBean();
		bean=rs.addNewCustomer(regBean);
		return new ResponseEntity<CustomerRegistrationBean>(bean,HttpStatus.OK);

}
}
