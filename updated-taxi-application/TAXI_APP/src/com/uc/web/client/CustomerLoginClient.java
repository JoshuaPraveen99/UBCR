package com.uc.web.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.uc.businessbean.LoginBean;
@Service
public class CustomerLoginClient {
	private RestTemplate restTemplate;
	@Value("${CustomerLoginService.serviceURL}")
	private String serviceUrl;
	@Value("${CustomerLoginService.apiURL}")
	private String apiUrl;
	public CustomerLoginClient() {
		this.restTemplate = new RestTemplate();
	}
	

    
	public LoginBean hitGetUserDetails(LoginBean loginBean) {
		System.out.println(serviceUrl);
		System.out.println(apiUrl);
		System.out.println(loginBean.getUserName());
		/*List<HttpMessageConverter<?>> converters = new ArrayList<>();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
	    converter.setObjectMapper(new ObjectMapper());
	    converters.add(converter);
	    restTemplate.setMessageConverters(converters);*/
		//HttpHeaders headers = new HttpHeaders();
		//headers.setContentType(MediaType.APPLICATION_JSON);
		//HttpEntity<LoginBean> entity= new HttpEntity<LoginBean>(lbean,headers);
		//System.out.println(entity);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<LoginBean> entity= new HttpEntity<LoginBean>(loginBean,headers);
		System.out.println(entity);
		ResponseEntity<LoginBean> response = restTemplate.exchange(serviceUrl+apiUrl, HttpMethod.POST,
				  entity,LoginBean.class);
		LoginBean cbean = response.getBody();
		return cbean;
		

}
}
