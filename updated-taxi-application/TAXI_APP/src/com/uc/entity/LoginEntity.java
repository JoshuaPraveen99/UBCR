package com.uc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class LoginEntity {
@Id
@Column(name="username")
private String userName;
@Column(name="password")
private String password;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return password;
}
public void setPassWord(String passWord) {
	this.password = passWord;
}



}
