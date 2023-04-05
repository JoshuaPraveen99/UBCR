package com.uc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ride")
public class PickUpEntity {
	@Column(name="location_Id")
	private int key;
	@Column(name="location")
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
	
	
	

}
