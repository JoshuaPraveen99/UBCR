package com.uc.entity;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="registration")
public class RegEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="p_ID")
	private Integer provider_ID;
	@Column(name="p_NAME")
	private String provider_Name;
	@Column(name="EMAIL")
	private String email;
	@Column(name="Contact")
	private long contact;
	@Column(name="Address")
	private String Address;
	@Lob
	@Column(name="p_Image", columnDefinition="MEDIUMBLOB")
	private byte[] provider_Photo;
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="car_type")
	private String carType;
	@Column(name="car_model")
	private String carModel;
	@Column(name="reg_num")
	private String regNum;
	@Lob
	@Column(name="car_Photo", columnDefinition="MEDIUMBLOB")
	private byte[] car_Photo;
	@Column(name="license_Num")
	private String licenseNum;
	@Column(name="license_Image",columnDefinition="MEDIUMBLOB")
	private byte[] license_Photo;
	@Column(name="rc_num")
	private String rcNum;
	@Lob
	@Column(name="rc_Photo",columnDefinition="MEDIUMBLOB")
	private byte[] rc_Photo;
	
	public RegEntity(){
		
	}

	public RegEntity(Integer provider_ID, String provider_Name, String email, long contact, String address,
			byte[] provider_Photo, String userName, String password, String carType, String carModel, String regNum,
			byte[] carPhoto, String licenseNum, byte[] license_Photo, String rcNum, byte[] rc_Photo) {
		super();
		this.provider_ID = provider_ID;
		this.provider_Name = provider_Name;
		this.email = email;
		this.contact = contact;
		Address = address;
		this.provider_Photo = provider_Photo;
		this.userName = userName;
		this.password = password;
		this.carType = carType;
		this.carModel = carModel;
		this.regNum = regNum;
		this.car_Photo = carPhoto;
		this.licenseNum = licenseNum;
		this.license_Photo = license_Photo;
		this.rcNum = rcNum;
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

	public String getRegNum() {
		return regNum;
	}

	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}

	public byte[] getCarPhoto() {
		return car_Photo;
	}

	public void setCarPhoto(byte[] carPhoto) {
		this.car_Photo = carPhoto;
	}

	public String getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
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
