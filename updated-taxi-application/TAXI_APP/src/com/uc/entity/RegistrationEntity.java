package com.uc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "registration")
public class RegistrationEntity {

 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "C_ID")
  private Integer C_ID;

  @Column(name = "C_NAME")
  private String C_NAME;

  @Column(name = "Contact")
  private String Contact;

  @Column(name = "EMAIL")
  private String email;

  @Column(name = "Address")
  private String Address;

  @Lob
  @Column(name = "Image", length = Integer.MAX_VALUE)
  private byte[] Photo;

  @Column(name = "username")
  private String username;

  @Column(name = "password")
  private String password;

public Integer getC_ID() {
	return C_ID;
}


public void setC_ID(Integer c_ID) {
	C_ID = c_ID;
}


public String getC_NAME() {
	return C_NAME;
}

public void setC_NAME(String c_NAME) {
	C_NAME = c_NAME;
}

public String getContact() {
	return Contact;
}

public void setContact(String contact) {
	Contact = contact;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public byte[] getPhoto() {
	return Photo;
}

public void setPhoto(byte[] photo) {
	Photo = photo;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
}
