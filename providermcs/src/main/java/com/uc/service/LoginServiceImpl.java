package com.uc.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uc.businessbean.LoginBean;
import com.uc.dao.LoginDao;
import com.uc.entity.LoginEntity;

@Service
public class LoginServiceImpl implements LoginService{
	LoginDao ldao;
	@SuppressWarnings("deprecation")
	@Override
	public LoginBean getLoginDetails(LoginBean lbean) {
        String username=lbean.getUserName();
        LoginBean lbean1=new LoginBean();
     	LoginEntity lentity=new LoginEntity();
		lentity=ldao.findOne(username);
		BeanUtils.copyProperties(lentity, lbean1);
	    
		
		return lbean1 ;
	}

}
