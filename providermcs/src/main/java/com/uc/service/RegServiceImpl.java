package com.uc.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uc.businessbean.RegBean;
import com.uc.dao.RegDAO;
import com.uc.entity.RegEntity;
@Service
public class RegServiceImpl implements RegService{

	@Autowired
	RegDAO rdao;
	
	@Override
	public RegBean addNewProvider(RegBean regBean) {
		RegBean rbean = new RegBean();
		RegEntity rEntity = rdao.RegisterNewProvider(convertBeanToEntity(regBean));
		rbean = convertEntityToBean(rEntity);
		return rbean;
	}

public RegEntity convertBeanToEntity(RegBean bean) {
	RegEntity rEntity = new RegEntity();
	BeanUtils.copyProperties(bean, rEntity);
	return rEntity;
}

public RegBean convertEntityToBean(RegEntity rEntity) {
	RegBean rbean = new RegBean();
	BeanUtils.copyProperties(rEntity, rbean);
	return rbean;
}

}