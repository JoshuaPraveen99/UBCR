package com.uc.service;

import com.uc.businessbean.RegistrationBean;
import com.uc.entity.LoginEntity;

public interface LoginService {


		LoginEntity validLogin(String us) throws Exception;

		


}
