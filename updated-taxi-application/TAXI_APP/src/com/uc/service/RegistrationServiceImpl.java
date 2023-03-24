package com.uc.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uc.businessbean.RegistrationBean;
import com.uc.dao.RegistrationDao;
import com.uc.entity.RegistrationEntity;


@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired RegistrationDao rdao;
	
	@Override
	public RegistrationBean saveDetails(RegistrationBean registrationBean) throws Exception {
		// TODO Auto-generated method stub
		RegistrationBean rbean= new RegistrationBean();
		RegistrationEntity re= new RegistrationEntity();
		BeanUtils.copyProperties(registrationBean, re);
		System.out.println(re.getC_NAME());
		re = rdao.saveRegistrationDetail(re);
		BeanUtils.copyProperties(re, rbean);
		
		
		return rbean;
	}
	

}
