package com.uc.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uc.businessbean.CustomerRegistrationBean;
import com.uc.dao.RegistrationDao;
import com.uc.entity.RegistrationEntity;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	RegistrationDao rdao;
	
	@Override
	public CustomerRegistrationBean addNewCustomer(CustomerRegistrationBean regBean) throws Exception {
		CustomerRegistrationBean rbean = new CustomerRegistrationBean();
		RegistrationEntity rEntity = rdao.RegisterNewCustomer(convertBeanToEntity(rbean));
		rbean = convertEntityToBean(rEntity);
		return rbean;
	}

public RegistrationEntity convertBeanToEntity(CustomerRegistrationBean bean) {
	RegistrationEntity rEntity = new RegistrationEntity();
	BeanUtils.copyProperties(bean, rEntity);
	return rEntity;
}

public CustomerRegistrationBean convertEntityToBean(RegistrationEntity rEntity) {
	CustomerRegistrationBean rbean = new CustomerRegistrationBean();
	BeanUtils.copyProperties(rEntity, rbean);
	return rbean;
}

}