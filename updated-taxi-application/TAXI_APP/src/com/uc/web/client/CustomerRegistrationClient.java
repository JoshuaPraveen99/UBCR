package com.uc.web.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.uc.businessbean.RegistrationBean;
@Service
public class CustomerRegistrationClient {
	private RestTemplate restTemplate;
	@Value("${CustomerRegistrationService.serviceURL}")
	private String serviceUrl;
	@Value("${CustomerRegistrationService.apiURL}")
	private String apiUrl;

	
	public CustomerRegistrationClient() {
		this.restTemplate=new RestTemplate();
	}
	
	public RegistrationBean addNewCustomer(RegistrationBean rbean) {
		System.out.println(apiUrl);
		System.out.println(rbean);
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<RegistrationBean> bean = new HttpEntity<RegistrationBean>(rbean,header);
		ResponseEntity<RegistrationBean> response = restTemplate.exchange(serviceUrl+apiUrl,HttpMethod.POST,bean,RegistrationBean.class);
		RegistrationBean regbean = response.getBody();
		return regbean ;
	}
	

}


