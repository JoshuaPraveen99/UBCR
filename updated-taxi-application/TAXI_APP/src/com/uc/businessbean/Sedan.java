package taxiapplication;

import java.math.BigInteger;
import java.util.List;

public class Sedan extends Taxi {


	public Sedan(int taxi_id, boolean booked, String currentSpot, int freeTime, int totalEarnings, List<String> trips) {
		super(taxi_id, booked, currentSpot, freeTime, totalEarnings, trips);
		// TODO Auto-generated constructor stub
	}
	 public Sedan(String carType,String currentSpot,String name,String carModel,String vehicleNumber,String contact) {
	    	super(carType,currentSpot,name,carModel,vehicleNumber,contact);
	    }

	@Override
	public int calculatePayment(int distanceBetweenpickUpandDrop) {
		payment=150+(distanceBetweenpickUpandDrop-5)*25;
		
		
		return payment;
	}

}