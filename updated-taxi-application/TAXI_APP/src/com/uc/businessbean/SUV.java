package com.uc.businessbean;

import java.math.BigInteger;
import java.util.List;

public class SUV extends Taxi {

	
   public SUV(String carType, String currentSpot, String name, String carModel, String vehicleNumber, String contact,
			double freeTime, int totalEarnings, int taxi_id, boolean booked) {
		super(carType, currentSpot, name, carModel, vehicleNumber, contact, freeTime, totalEarnings, taxi_id, booked);
		// TODO Auto-generated constructor stub
	}

/* public SUV(int taxi_id, boolean booked, String currentSpot, int freeTime, int totalEarnings, List<String> trips) {
		super(taxi_id, booked, currentSpot, freeTime, totalEarnings, trips);
		// TODO Auto-generated constructor stub
	}*/
  /*  public SUV(String carType,String currentSpot,String name,String carModel,String vehicleNumber,String contact) {
    	super(carType,currentSpot,name,carModel,vehicleNumber,contact);
    }*/

	@Override
	public int calculatePayment(int distanceBetweenpickUpandDrop) {
		payment=200+(distanceBetweenpickUpandDrop-5)*30;
		
		return payment;
	}

}
