package com.uc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uc.businessbean.Avadi;
import com.uc.businessbean.Beach;
import com.uc.businessbean.Chennai;
import com.uc.businessbean.Chromepet;
import com.uc.businessbean.Taxi;
import com.uc.businessbean.Vandalur;
import com.uc.dao.Taxidao;
import com.uc.entity.TaxiEntity;




@Service
public class RideBookingServiceImpl implements RideBookingService{
    @Autowired
	Taxidao tdao;
	
	List<Taxi>taxis=new ArrayList<>();
	private static final double EARTH_RADIUS = 6371; // Earth's radius in kilometers
	List<Taxi>freeTaxis=new ArrayList<>();
	 
	public static List<Taxi> getFreeTaxis(List<Taxi> taxis, double pickupTime, String pickupPoint){
		List<Taxi>freeTaxis=new ArrayList<Taxi>();
		for(Taxi t:taxis) {
			if(t.currentSpot.equals(pickupPoint) && t.freeTime<=pickupTime && (calculateDistance(t.currentSpot,pickupPoint)/50)<=pickupTime-t.freeTime) {
				freeTaxis.add(t);
			}
		}
		System.out.println(freeTaxis.size());
		return freeTaxis;
	}
	
	 public  static double calculateDistance(String pickup , String destination) {
	    	double lat1;
	    	double lat2;
	    	double lon1;
	    	double lon2;
         if(pickup.equals("Chennai")) {
         	Chennai chennai=new Chennai();
         	lat1=chennai.getChennaiLat();
         	lon1=chennai.getChennaiLon();
         	
         }
         else if(pickup.equals("Avadi")) {
         	Avadi avadi=new Avadi();
         	lat1=avadi.getAvadiLat();
         	lon1=avadi.getAvadiLon();
         }
         else if(pickup.equals("Chromepet")) {
         	Chromepet chromepet=new Chromepet();
         	lat1=chromepet.getChrompetLat();
         	lon1=chromepet.getChrompetLon();
         }
         else if(pickup.equals("Beach")) {
         	Beach beach =new Beach();
         	lat1=beach.getBeachLat();
         	lon1=beach.getBeachLon();
         }
         else {
         	Vandalur vandalur=new Vandalur();
         	lat1=vandalur.getVandalurLat();
         	lon1=vandalur.getVandalurLon();
         }
         if(destination.equals("Chennai")) {
         	Chennai chennai=new Chennai();
         	lat2=chennai.getChennaiLat();
         	lon2=chennai.getChennaiLon();
         }
         else if(destination.equals("Avadi")) {
         	Avadi avadi=new Avadi();
         	lat2=avadi.getAvadiLat();
         	lon2=avadi.getAvadiLon();
         }
         else if(destination.equals("Beach")) {
         	Beach beach=new Beach();
         	lat2=beach.getBeachLat();
         	lon2=beach.getBeachLon();
         }
         else if(destination.equals("Chromepet")) {
         	Chromepet chromepet=new Chromepet();
         	lat2=chromepet.getChrompetLat();
         	lon2=chromepet.getChrompetLon();
         }
         else {
         	Vandalur vandalur=new Vandalur();
         	lat2=vandalur.getVandalurLat();
         	lon2=vandalur.getVandalurLon();
         }
         
	        double latDistance = Math.toRadians(lat2 - lat1);
	        double lonDistance = Math.toRadians(lon2 - lon1);
	        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
	                 + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
	                 * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
	        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	        return EARTH_RADIUS * c;
	    }
	
	@Override
	public List<Taxi> bookaRide(String pickup, String destination, double pickupTime) {
		
		List<TaxiEntity>taxiEntity=new ArrayList<>();
		taxiEntity=tdao.findAll();
		System.out.println(taxiEntity);
		List<Taxi> taxis = taxiEntity.stream()
			    .map(taxiEntities -> {
			        Taxi taxi = new Taxi(taxiEntities.getCarType(),taxiEntities.getCurrentSpot(),taxiEntities.getDriverName(),taxiEntities.getCarModel(),taxiEntities.getVehicleNumber(),taxiEntities.getContact(),taxiEntities.getFreeTime(),taxiEntities.getTotalEarnings(),taxiEntities.getTaxi_id(),taxiEntities.isBooked());
			        // set properties of taxi from taxiEntity
			        return taxi;
			    })
			    .collect(Collectors.toList());
		List<Taxi> freeTaxis = getFreeTaxis(taxis,pickupTime,pickup);
		System.out.println(freeTaxis);
		
		
	}

}
