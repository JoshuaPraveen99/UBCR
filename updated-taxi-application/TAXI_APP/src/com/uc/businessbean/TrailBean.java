package com.uc.businessbean;

public class TrailBean {

	private Integer key;
	private String pickUp_Location;
	
	public String getPickUp_Location() {
		return pickUp_Location;
	}
	public void setPickUp_Location(String pickUp_Location) {
		this.pickUp_Location = pickUp_Location;
	}
	
	
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	@Override
	public String toString() {
		return "TrailBean [pickUp_Location=" + pickUp_Location + "]";
	}
	
	
}
