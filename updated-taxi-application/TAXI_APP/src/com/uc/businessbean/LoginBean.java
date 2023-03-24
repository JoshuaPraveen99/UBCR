package com.uc.businessbean;



import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginBean {
	@NotEmpty(message="UserName cannot be empty")
	private String userName;
	@NotEmpty(message="Password cannot be empty")
	@Size(min=5,max=10,message="Password length should be from 5 to 10")
	private String password;
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
	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
