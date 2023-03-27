package com.uc.web.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.uc.businessbean.ProviderRegBean;
import com.uc.businessbean.TrailBean;

@Service
public class ProviderRegClient {

	private RestTemplate restTemplate;
	@Value("${ProviderRegService.serviceURL}")
	private String serviceUrl;
	@Value("${ProviderRegService.apiURL}")
	private String apiUrl;
	@Value("${ProviderService.photoUrl}")
	private String photoUrl;
	
	public ProviderRegClient() {
		this.restTemplate=new RestTemplate();
	}
	
	public ProviderRegBean addNewProvider(ProviderRegBean rbean) {
		System.out.println(apiUrl);
		System.out.println(rbean);
		byte[] b = rbean.getLicense_Photo();
		long size = b.length;
		System.out.println(size);
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<ProviderRegBean> bean = new HttpEntity<ProviderRegBean>(rbean,header);
		ResponseEntity<ProviderRegBean> response = restTemplate.exchange(serviceUrl+apiUrl,HttpMethod.POST,bean,ProviderRegBean.class);
		ProviderRegBean dummy = response.getBody();
		return dummy;
	}
	
	public TrailBean sendImage(TrailBean bean) {
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<TrailBean> requestObj = new HttpEntity<TrailBean>(bean,header);
		ResponseEntity<TrailBean> response = restTemplate.postForEntity(serviceUrl+photoUrl, requestObj, TrailBean.class);
		return response.getBody();
	}
}
