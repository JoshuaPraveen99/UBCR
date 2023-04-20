package com.uc.service;

import java.util.List;

import com.uc.businessbean.Taxi;

public interface RideBookingService {

	public List<Taxi> bookaRide(String pickup, String destination, double pickupTime);

	public Taxi confirmTaxi(int id,String pickup,String destination);

	public List<Taxi> bookaAltRide(String pickup, String destination, double pickupTime);

}
