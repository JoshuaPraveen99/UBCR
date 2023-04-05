package com.uc.businessbean;

public class DropOffBean {
	
	private int key;
	private String dropOffLocation;
	
	
	public DropOffBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public DropOffBean(int key, String dropOffLocation) {
		super();
		this.key = key;
		this.dropOffLocation = dropOffLocation;
	}


	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getDropOffLocation() {
		return dropOffLocation;
	}
	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}
	
	

}
