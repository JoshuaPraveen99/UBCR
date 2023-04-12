package taxiapplication;

import java.math.BigInteger;
import java.util.List;

public class Hatchback extends Taxi{


	public Hatchback(int taxi_id, boolean booked, String currentSpot, int freeTime, int totalEarnings,
			List<String> trips) {
		super(taxi_id, booked, currentSpot, freeTime, totalEarnings, trips);
		// TODO Auto-generated constructor stub
	}
	 public Hatchback(String carType,String currentSpot,String name,String carModel,String vehicleNumber,String contact) {
	    	super(carType,currentSpot,name,carModel,vehicleNumber,contact);
	    }

	@Override
	public int calculatePayment(int distanceBetweenpickUpandDrop) {
		payment=100+(distanceBetweenpickUpandDrop-5)*20;
		
		return payment;
	}

}
