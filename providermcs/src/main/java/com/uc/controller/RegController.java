package com.uc.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uc.businessbean.RegBean;
import com.uc.businessbean.TrailBean;
import com.uc.service.ImageService;
import com.uc.service.RegService;

@RestController
public class RegController {
	
	@Autowired
	RegService rs;
	@Autowired
	ImageService is;
	
	@PostMapping(value="/provider/register",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RegBean> addUser(@RequestBody RegBean regBean){
		System.out.println(regBean);
		byte[] b = regBean.getLicense_Photo();
		long size =b.length;
		System.out.println(size);
		RegBean bean = new RegBean();
		bean=rs.addNewProvider(regBean);
		return new ResponseEntity<RegBean>(bean,HttpStatus.OK);
	}

	@GetMapping("/check")
	public String check() {
		return "RegController is working";
	}
	
	@PostMapping(value="/save/image",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveImage(@RequestBody TrailBean bean) throws IOException{
		
		String msg = is.saveImage(bean);
		return new ResponseEntity<String>(msg,HttpStatus.OK);	
	}
	
}
