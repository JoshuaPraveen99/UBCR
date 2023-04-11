package com.uc.businessbean;

public class DropOffBean {
	
	private int key;
	private String dropOffLocation;
	
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
	@Override
	public String toString() {
		return "DropOffBean [key=" + key + ", dropOffLocation=" + dropOffLocation + "]";
	}
	
	

}
