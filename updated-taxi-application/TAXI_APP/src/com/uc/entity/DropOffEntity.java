package com.uc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="dropOff")
public class DropOffEntity {

	@Column(name="location_Id")
	private int key;
	@Column(name="location")
	private String dropOffLocations;
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getDropOffLocations() {
		return dropOffLocations;
	}
	public void setDropOffLocations(String dropOffLocations) {
		this.dropOffLocations = dropOffLocations;
	}
	
	
}
