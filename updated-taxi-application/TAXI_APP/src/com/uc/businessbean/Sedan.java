package com.uc.businessbean;

import java.math.BigInteger;
import java.util.List;

public class Sedan extends Taxi {


	public Sedan(String carType, String currentSpot, String name, String carModel, String vehicleNumber, String contact,
			double freeTime, int totalEarnings, int taxi_id, boolean booked) {
		super(carType, currentSpot, name, carModel, vehicleNumber, contact, freeTime, totalEarnings, taxi_id, booked);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculatePayment(int distanceBetweenpickUpandDrop) {
		payment=150+(distanceBetweenpickUpandDrop-5)*25;
		
		
		return payment;
	}

}
