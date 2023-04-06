package com.uc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dropOff")
public class DropOffEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="location_id")
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
