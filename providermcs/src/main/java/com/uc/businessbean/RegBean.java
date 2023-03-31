package com.uc.businessbean;

import java.util.Arrays;

public class RegBean {

	private Integer provider_ID;
	private String provider_Name;
	private long contact;
	private String email;
	private String Address;
	private byte[] provider_Photo;
	private String userName;
	private String password;
	private String carType;
	private String carModel;
	private String regNum;
	private byte[] car_Photo;
	private String licenseNum;
	private byte[] license_Photo;
	private String rcNum;
	private byte[] rc_Photo;
	
	public byte[] getProvider_Photo() {
		return provider_Photo;
	}
	public void setProvider_Photo(byte[] provider_Photo) {
		this.provider_Photo = provider_Photo;
	}
	public byte[] getCarPhoto() {
		return car_Photo;
	}
	public void setCarPhoto(byte[] carPhoto) {
		this.car_Photo = carPhoto;
	}
	public byte[] getLicense_Photo() {
		return license_Photo;
	}
	public void setLicense_Photo(byte[] license_Photo) {
		this.license_Photo = license_Photo;
	}
	public byte[] getRc_Photo() {
		return rc_Photo;
	}
	public void setRc_Photo(byte[] rc_Photo) {
		this.rc_Photo = rc_Photo;
	}
	
	public Integer getProvider_ID() {
		return provider_ID;
	}
	public void setProvider_ID(Integer provider_ID) {
		this.provider_ID = provider_ID;
	}
	public String getProvider_Name() {
		return provider_Name;
	}
	public void setProvider_Name(String provider_Name) {
		this.provider_Name = provider_Name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
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
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getRegNum() {
		return regNum;
	}
	public void setRegNum(String regNumber) {
		this.regNum = regNumber;
	}
	
	public String getLicenseNum() {
		return licenseNum;
	}
	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}
	
	public String getRcNum() {
		return rcNum;
	}
	public void setRcNum(String rcNum) {
		this.rcNum = rcNum;
	}
	@Override
	public String toString() {
		return "RegBean [provider_ID=" + provider_ID + ", provider_Name=" + provider_Name + ", contact=" + contact
				+ ", email=" + email + ", Address=" + Address + ", provider_Photo=" + Arrays.toString(provider_Photo)
				+ ", userName=" + userName + ", password=" + password + ", carType=" + carType + ", carModel="
				+ carModel + ", regNumber=" + regNum + ", carPhoto=" + Arrays.toString(car_Photo) + ", licenseNum="
				+ licenseNum + ", license_Photo=" + Arrays.toString(license_Photo) + ", rcNum=" + rcNum + ", rc_Photo="
				+ Arrays.toString(rc_Photo) + "]";
	}
	
	
}
