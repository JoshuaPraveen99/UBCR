package com.uc.businessbean;

<<<<<<< Updated upstream:ProviderMicroService/src/main/java/com/uc/businessBean/ProviderLoginBean.java
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProviderLoginBean {
	
=======
public class LoginBean {
>>>>>>> Stashed changes:providermcs/src/main/java/com/uc/businessbean/LoginBean.java
	private String userName;
    @Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
    


}
