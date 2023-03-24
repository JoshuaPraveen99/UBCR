package com.uc.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class RegEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="p_ID")
	private Integer provider_ID;
	@Column(name="p_NAME")
	private String provider_Name;
	@Column(name="EMAIL")
	private String email;
	@Column(name="contact")
	private long contact;
	@Column(name="Address")
	private String Address;
	@Lob
	@Column(name="p_Image",length = Integer.MAX_VALUE)
	private byte[] provider_Photo;
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="carType")
	private String carType;
	@Column(name="carModel")
	private String carModel;
	@Column(name="regNum")
	private String regNumber;
	@Lob
	@Column(name="carPhoto",length=Integer.MAX_VALUE)
	private byte[] carPhoto;
	@Column(name="license_Num")
	private String lisenceNum;
	@Column(name="license_Image",length=Integer.MAX_VALUE)
	private byte[] license_Photo;
	@Column(name="rc_num")
	private String rcNum;
	@Lob
	@Column(name="rc_Photo",length=Integer.MAX_VALUE)
	private byte[] rc_Photo;
	
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
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
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
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public byte[] getCarPhoto() {
		return carPhoto;
	}
	public void setCarPhoto(byte[] carPhoto) {
		this.carPhoto = carPhoto;
	}
	public String getLisenceNum() {
		return lisenceNum;
	}
	public void setLisenceNum(String lisenceNum) {
		this.lisenceNum = lisenceNum;
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