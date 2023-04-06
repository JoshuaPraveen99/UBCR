package com.uc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uc.dao.LoginDao;
import com.uc.entity.LoginEntity;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginDao ldao;

	@Override
	public LoginEntity validLogin(String userName) 
	{
	
		LoginEntity lentity = ldao.findOne(userName);		
	return lentity;
	}


		
		

}
