package com.uc.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="taxis")
public class TaxiEntity {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="taxi_id")
	 int taxi_id;
	 
	 @Column(name="booked")
	 boolean booked;
	 
	 @Column(name="currentSpot")
	 String currentSpot;
	 
	 @Column(name="nextSpot")
	 String nextSpot;
	 
	 @Column(name="freeTime")
	 double freeTime;
	 
	 @Column(name="totalEarnings")
	 int totalEarnings;
	 
	 @Column(name="payment")
	 int payment;
	 
	 @Column(name="carType")
	 String carType;
	 
	 @Column(name="driverName")
	 String driverName;
	 
	 @Column(name="location")
	 String carModel;
	 
	 @Column(name="contact")
	 String contact;
	 
	 @Column(name="vehicleNumber")
	 String vehicleNumber;
	 
	 @Column(name="estimated_time")
	 double estimated_time;

	public int getTaxi_id() {
		return taxi_id;
	}

	public void setTaxi_id(int taxi_id) {
		this.taxi_id = taxi_id;
	}

	public boolean isBooked() {
		return booked;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}

	public String getCurrentSpot() {
		return currentSpot;
	}

	public void setCurrentSpot(String currentSpot) {
		this.currentSpot = currentSpot;
	}

	public String getNextSpot() {
		return nextSpot;
	}

	public void setNextSpot(String nextSpot) {
		this.nextSpot = nextSpot;
	}

	public double getFreeTime() {
		return freeTime;
	}

	public void setFreeTime(double freeTime) {
		this.freeTime = freeTime;
	}

	public int getTotalEarnings() {
		return totalEarnings;
	}

	public void setTotalEarnings(int totalEarnings) {
		this.totalEarnings = totalEarnings;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public double getEstimated_time() {
		return estimated_time;
	}

	public void setEstimated_time(double estimated_time) {
		this.estimated_time = estimated_time;
	}

}
