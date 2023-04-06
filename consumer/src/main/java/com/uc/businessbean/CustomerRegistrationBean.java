package com.uc.businessbean;

import java.util.Arrays;

public class CustomerRegistrationBean {
	 private Integer C_ID;

		private String C_NAME;
		private String Contact;
		private String email;
		private String Address;
		private byte[] Photo;
		private String username;
		private String password;
		public Integer getC_ID() {
			return C_ID;
		}
		public void setC_ID(Integer C_ID) {
			this.C_ID = C_ID;
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
		@Override
		public String toString() {
			return "CustomerRegistrationBean [C_ID=" + C_ID + ", C_NAME=" + C_NAME + ", Contact=" + Contact + ", email="
					+ email + ", Address=" + Address + ", Photo=" + Arrays.toString(Photo) + ", username=" + username
					+ ", password=" + password + "]";
		}
	

}
