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
	 int taxi_id;
	 boolean booked;
	 public String currentSpot;
	 String nextSpot;
	 public double freeTime;
	 int totalEarnings;
	 List<String>trips;
	 int payment;
	 String carType;
	 String driverName;
	 String carModel;
	 String contact;
	 String vehicleNumber;
	 double estimated_time;
public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public double getestimated_time(){
		return estimated_time;
	}
	public Taxi(int taxi_id, boolean booked, String currentSpot, int freeTime, int totalEarnings, List<String> trips) {
		super();
		this.taxi_id = taxi_id;
		this.booked = booked;
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
	public void setDetails(boolean b, String nextSpot, double nextFreeTime, int i, String tripDetail) {
		this.booked=b;
		this.currentSpot=nextSpot;
		this.freeTime=nextFreeTime;
		this.totalEarnings=i;
		this.trips.add(tripDetail);
		// TODO Auto-generated method stub
		
	}
    @Override
	public String toString() {
		return "Taxi [taxi_id=" + taxi_id + ", booked=" + booked + ", currentSpot=" + currentSpot + ", nextSpot="
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
    public Taxi(String carType, String currentSpot,String name,String carModel,String vehicleNumber,String contact, double freeTime,int totalEarnings,int taxi_id,boolean booked)
    {
        this.booked = booked;
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
