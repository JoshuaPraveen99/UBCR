package com.uc.businessbean;

import javax.validation.constraints.Size;

public class ProviderLoginBean {
	
	private String userName;
	@Size(min=5,max=10,message="The minimum no of characters should be 5 and maximum must be 10")
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
	
	
}
