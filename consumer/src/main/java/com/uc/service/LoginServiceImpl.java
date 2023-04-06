package com.uc.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uc.businessbean.CustomerLoginBean;
import com.uc.dao.LoginDao;
import com.uc.entity.LoginEntity;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginDao ldao;
	@Override
	public CustomerLoginBean getLoginDetails(CustomerLoginBean lbean) {
        String username=lbean.getUserName();
        CustomerLoginBean lbean1=new CustomerLoginBean();
     	LoginEntity lentity=new LoginEntity();
		lentity=ldao.findByuserName(username);
		System.out.println(lentity);
		if(lentity==null) {
			lbean1.setUserName("xxx");
			lbean1.setPassword("xxx");
		}
		else {
		BeanUtils.copyProperties(lentity, lbean1);
		}
		return lbean1 ;
	}
}