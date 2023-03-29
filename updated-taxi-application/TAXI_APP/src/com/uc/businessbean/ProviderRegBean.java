package com.uc.businessbean;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"provider_Image","car_Image","license_Image","rc_Image"})
public class ProviderRegBean {

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
		private byte[] carPhoto;
		private String licenseNum;
		private byte[] license_Photo;
		private String rcNum;		
		private byte[] rc_Photo;
		
		private MultipartFile provider_Image;
		private MultipartFile car_Image;
		private MultipartFile license_Image;
		private MultipartFile rc_Image;
		
		
		
		public MultipartFile getProvider_Image() {
			return provider_Image;
		}
		public void setProvider_Image(MultipartFile provider_Image) {
			this.provider_Image = provider_Image;
			try {
				byte[] bytearr = provider_Image.getBytes();
				setProvider_Photo(bytearr);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public MultipartFile getCar_Image() {
			return car_Image;
		}
		public void setCar_Image(MultipartFile car_Image) {
			this.car_Image = car_Image;
			try {
				byte[] bytearr = car_Image.getBytes();
				setCarPhoto(bytearr);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public MultipartFile getLicense_Image() {
			return license_Image;
		}
		public void setLicense_Image(MultipartFile license_Image) {
			this.license_Image = license_Image;
			try {
				byte[] bytearr = license_Image.getBytes();
				setLicense_Photo(bytearr);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public MultipartFile getRc_Image() {
			return rc_Image;
		}
		public void setRc_Image(MultipartFile rc_Image) {
			this.rc_Image = rc_Image;
			try {
				byte[] bytearr = rc_Image.getBytes();
				setRc_Photo(bytearr);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	
		public byte[] getProvider_Photo() {
			return provider_Photo;
		}
		public void setProvider_Photo(byte[] provider_Photo) {
			this.provider_Photo = provider_Photo;
		}
		public byte[] getCarPhoto() {
			return carPhoto;
		}
		public void setCarPhoto(byte[] carPhoto) {
			this.carPhoto = carPhoto;
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
		public void setRegNum(String regNum) {
			this.regNum = regNum;
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
			return "ProviderRegBean [provider_ID=" + provider_ID + ", provider_Name=" + provider_Name + ", contact="
					+ contact + ", email=" + email + ", Address=" + Address + ", provider_Photo="
					+ Arrays.toString(provider_Photo) + ", userName=" + userName + ", password=" + password
					+ ", carType=" + carType + ", carModel=" + carModel + ", regNumber=" + regNum + ", carPhoto="
					+ Arrays.toString(carPhoto) + ", licenseNum=" + licenseNum + ", license_Photo="
					+ Arrays.toString(license_Photo) + ", rcNum=" + rcNum + ", rc_Photo=" + Arrays.toString(rc_Photo)
					+ "]";
		}
		
		
		
		
		
		

}
