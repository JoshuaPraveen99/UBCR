package com.uc.businessbean;

import javax.validation.constraints.Size;

public class ProviderRegBean {
	private String name;
	private String email;
	private long contact;
	private String address;
	private byte[] provider_Photo;
	private String userName;
	@Size(min=5,max=10,message="The no of characters should be minimum of 5 and maximum of 10")
	private String password;
	private String carModel;
	private String carType;
	private String regNum;
	private byte[] car_Photo;
	private String licenseNo;
	private byte[] license_Photo;
	private String rcNum;
	private byte[] rc_Photo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public byte[] getProvider_Photo() {
		return provider_Photo;
	}
	public void setProvider_Photo(byte[] provider_Photo) {
		this.provider_Photo = provider_Photo;
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
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getRegNum() {
		return regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public byte[] getCar_Photo() {
		return car_Photo;
	}
	public void setCar_Photo(byte[] car_Photo) {
		this.car_Photo = car_Photo;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public byte[] getLicense_Photo() {
		return license_Photo;
	}
	public void setLicense_Photo(byte[] license_Photo) {
		this.license_Photo = license_Photo;
	}
	public String getRcNum() {
		return rcNum;
	}
	public void setRcNum(String rcNum) {
		this.rcNum = rcNum;
	}
	public byte[] getRc_Photo() {
		return rc_Photo;
	}
	public void setRc_Photo(byte[] rc_Photo) {
		this.rc_Photo = rc_Photo;
	}
	
	
	
	
	
}
