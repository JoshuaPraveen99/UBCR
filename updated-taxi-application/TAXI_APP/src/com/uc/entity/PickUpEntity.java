package com.uc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ride")
public class PickUpEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="location_id")
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
