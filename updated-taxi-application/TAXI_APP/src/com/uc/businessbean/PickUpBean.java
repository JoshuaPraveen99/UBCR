package com.uc.businessbean;

public class PickUpBean {

	private int key;
	private String pickUpLocations;

	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getPickUpLocations() {
		return pickUpLocations;
	}
	public void setPickUpLocations(String pickUpLocations) {
		this.pickUpLocations = pickUpLocations;
	}
	@Override
	public String toString() {
		return "PickUpBean [key=" + key + ", pickUpLocations=" + pickUpLocations + "]";
	}
	
	
	
	
}
