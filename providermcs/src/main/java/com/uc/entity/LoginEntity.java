package com.uc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="providerlogincredentials")
public class LoginEntity {
	
	@Id
	@Column(name="user")
	private String userName;
	@Column(name="password")
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
		return "LoginEntity [userName=" + userName + ", password=" + password + "]";
	}

}
