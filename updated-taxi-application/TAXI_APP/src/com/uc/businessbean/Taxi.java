package com.uc.businessbean;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Taxi {
	static int taxi_count=0;
	public int getTaxi_count() {
		return taxi_count;
	}
	public void setTaxi_count(int taxi_count) {
		Taxi.taxi_count = taxi_count;
	}
	public int taxi_id;
	 public String currentSpot;
	 public String nextSpot;
	 public double freeTime;
	 public int totalEarnings;
	 public List<String>trips;
	 public int payment;
	 public String carType;
	 public String driverName;
	 public String carModel;
	 public String contact;
	 public String vehicleNumber;
	 public double estimated_time;
public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public double getestimated_time(){
		return estimated_time;
	}
	public Taxi(int taxi_id, String currentSpot, int freeTime, int totalEarnings, List<String> trips) {
		super();
		this.taxi_id = taxi_id;
		this.currentSpot = currentSpot;
		this.freeTime = freeTime;
		this.totalEarnings = totalEarnings;
		this.trips = trips;
	}
	public int getTaxi_id() {
		return taxi_id;
	}
	public void setTaxi_id(int taxi_id) {
		this.taxi_id = taxi_id;
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
	public void setFreeTime(int freeTime) {
		this.freeTime = freeTime;
	}
	public int getTotalEarnings() {
		return totalEarnings;
	}
	public void setTotalEarnings(int totalEarnings) {
		this.totalEarnings = totalEarnings;
	}
	public List<String> getTrips() {
		return trips;
	}
	public void setTrips(List<String> trips) {
		this.trips = trips;
	}
	public int calculatePayment(int distanceBetweenpickUpandDrop) {
		payment=100+(distanceBetweenpickUpandDrop-5)*20;
		
		return payment;
	}
	public void setDetails( String nextSpot, double nextFreeTime, int i, String tripDetail) {
		this.currentSpot=nextSpot;
		this.freeTime=nextFreeTime;
		this.totalEarnings=i;
		this.trips.add(tripDetail);
		// TODO Auto-generated method stub
		
	}
    @Override
	public String toString() {
		return "Taxi [taxi_id=" + taxi_id +  ", currentSpot=" + currentSpot + ", nextSpot="
				+ nextSpot + ", freeTime=" + freeTime + ", totalEarnings=" + totalEarnings + ", trips=" + trips
				+ ", payment=" + payment + ", carType=" + carType + ", driverName=" + driverName + ", carModel="
				+ carModel + ", contact=" + contact + ", vehicleNumber=" + vehicleNumber + ", estimated_time="
				+ estimated_time + "]";
	}
	public void printTaxiDetails()
    {
        //print total earning and taxi details like current location and free time
        System.out.println("Taxi - "+ this.taxi_id + " Total Earnings - " + this.totalEarnings + " Current spot - " + this.currentSpot +" Free Time - " + this.freeTime);
    }
    public void printDetails()
    {
        //print all trips details
        System.out.println("Taxi - "+ this.taxi_id + " Total Earnings - " + this.totalEarnings);
       // System.out.println("TaxiID    BookingID    CustomerID    From    To    PickupTime    DropTime    Amount");
        for(String trip : trips)
        {
            System.out.println(taxi_id + "          " + trip);
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }
    public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
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
	public void setFreeTime(double freeTime) {
		this.freeTime = freeTime;
	}
	public Taxi(String carType, String currentSpot,String name,String carModel,String vehicleNumber,String contact, double freeTime,int totalEarnings,int taxi_id)
    {
        this.currentSpot = currentSpot;//start point 
        this.freeTime = freeTime;
        this.totalEarnings = totalEarnings;
        this.taxi_id = taxi_id;
        this.carType=carType;
        this.driverName=name;
        this.contact=contact;
        this.vehicleNumber=vehicleNumber;
        this.carModel=carModel;
    }
         
}
