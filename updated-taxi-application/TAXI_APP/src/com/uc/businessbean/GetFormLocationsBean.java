package com.uc.businessbean;

import org.springframework.stereotype.Component;

@Component
public class GetFormLocationsBean {

	private int pickUpKey;
	private int dropOffKey;
	private String pickUpLocation;
	private String dropOffLocation;
	
	public int getPickUpKey() {
		return pickUpKey;
	}
	public void setPickUpKey(int pickUpKey) {
		this.pickUpKey = pickUpKey;
	}
	public int getDropOffKey() {
		return dropOffKey;
	}
	public void setDropOffKey(int dropOffKey) {
		this.dropOffKey = dropOffKey;
	}
	public String getPickUpLocation() {
		return pickUpLocation;
	}
	public void setPickUpLocation(String pickUpLOcation) {
		this.pickUpLocation = pickUpLOcation;
	}
	public String getDropOffLocation() {
		return dropOffLocation;
	}
	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}
	@Override
	public String toString() {
		return "GetFormLocationsBean [pickUpKey=" + pickUpKey + ", dropOffKey=" + dropOffKey + ", pickUpLocation="
				+ pickUpLocation + ", dropOffLocation=" + dropOffLocation + "]";
	}
	
	
	
}
