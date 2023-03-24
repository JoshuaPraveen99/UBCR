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
import com.uc.businessbean.ProviderLoginBean;

@Service
public class ProviderLoginClient {
	
	@Value("${ProviderLoginService.serviceURL}")
	private String serviceURL;
	@Value("${ProviderLoginService.apiURL}")
	private String apiURL;
	private RestTemplate restTemplate;
	
	public ProviderLoginClient() {
		this.restTemplate = new RestTemplate();
	}
	

    
	public LoginBean hitGetUserDetails(ProviderLoginBean loginBean) {
		System.out.println(serviceURL);
		System.out.println(apiURL);
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
		HttpEntity<ProviderLoginBean> entity= new HttpEntity<ProviderLoginBean>(loginBean,headers);
		System.out.println(entity);
		ResponseEntity<LoginBean> response = restTemplate.exchange(serviceURL+apiURL, HttpMethod.POST,
				  entity,LoginBean.class);
		LoginBean pbean = response.getBody();
		return pbean;
		
	}

/*	public LoginBean hitGetUserDetails(LoginBean loginBean) {
		ResponseEntity response=restTemplate.getForEntity(serviceURL+apiURL,LoginBean.class);
		return loginBean;
	}
*/
}