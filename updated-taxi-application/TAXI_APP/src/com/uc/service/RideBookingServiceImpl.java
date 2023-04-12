package com.uc.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;

import org.modelmapper.Converters.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


import com.uc.businessbean.Avadi;
import com.uc.businessbean.Beach;
import com.uc.businessbean.Chennai;
import com.uc.businessbean.Chromepet;
import com.uc.businessbean.Hatchback;
import com.uc.businessbean.SUV;
import com.uc.businessbean.Sedan;
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
	List<Taxi>freetaxis=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	
	
	public static void bookTaxi(int id,String pickup,String destination,double pickupTime,List<Taxi>freeTaxis) {	
		int min=999;
		int distancebetweenpickUpandDrop=0;
		int earning=0;
		double nextFreeTime=0;
		String nextSpot="";
		Taxi bookedTaxi=null;
		String tripDetail="";
		for(Taxi t:freeTaxis) {
			//System.out.println(t.currentSpot);
			//System.out.println(pickup);
			int distanceBetweenCustomerandTaxi= (int)calculateDistance(t.getCurrentSpot(),pickup);
			//System.out.println(t.currentSpot);
			//System.out.println(distanceBetweenCustomerandTaxi);
			//if(distanceBetweenCustomerandTaxi<min) {
				bookedTaxi=t;
				distancebetweenpickUpandDrop=(int)calculateDistance(pickup,destination);
				//System.out.println(distancebetweenpickUpandDrop);
		    if(t.getClass()==Sedan.class) {
				earning=t.calculatePayment(distancebetweenpickUpandDrop);
				//System.out.println(earning);
		    }
		    else if(t.getClass()==SUV.class) {
		    	earning=t.calculatePayment(distancebetweenpickUpandDrop);
		    }
		    else if(t.getClass()==Hatchback.class) {
		    	earning=t.calculatePayment(distancebetweenpickUpandDrop);
		    }
		    double result=(double)distancebetweenpickUpandDrop/50.0;
		    double timetodrop = Double.parseDouble(String.format("%.2f", result));
		    System.out.println(timetodrop);
		    
		    double dropTime=(double)pickupTime+timetodrop;
		    if(dropTime>24){
                dropTime=0+timetodrop;
			}
		    if (dropTime % 1 >= 0.6) { // check if the decimal part is 0.6
		    	  dropTime += 0.4; // increment by 0.4 to make it 1.0
		    	}
		    dropTime = Double.parseDouble(String.format("%.2f", dropTime));
		    
		    nextFreeTime=dropTime;
		    
		    nextSpot=destination;
		    
		    
		    tripDetail= "pickup: "+pickup+" destination: "+destination+" pickUpTime: "+pickupTime+" dropTime: "+dropTime+" earning: "+earning;
		    
		    //min=distanceBetweenCustomerandTaxi;
			//}
			
		}
		//bookedTaxi.setDetails(true,nextSpot,nextFreeTime,bookedTaxi.totalEarnings+earning,tripDetail);
		
		System.out.println("Taxi "+bookedTaxi.taxi_id+ " booked.\n");
		System.out.println("TAXI DETAILS: \n"+"DRIVER NAME: "+bookedTaxi.driverName+" VEHICLE NUMBER: "+bookedTaxi.vehicleNumber+" CAR MODEL: "+bookedTaxi.carModel+" CONTACT: "+bookedTaxi.contact+"\n");
	}
	 
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
	public void bookaRide(String pickup, String destination, double pickupTime) {
		
		List<TaxiEntity>taxiEntity=new ArrayList<>();
		taxiEntity=tdao.findAll();
		System.out.println(taxiEntity);
		
		/*List<TaxiEntity> entityList = // your entity list
				ModelMapper modelMapper = new ModelMapper();

				Converter<TaxiEntity, Taxi> sedanConverter = mappingContext -> {
				    TaxiEntity taxiEntities = mappingContext.getSource();
				    Taxi bean = new Sedan(taxiEntities.getCarType(),taxiEntities.getCurrentSpot(),taxiEntities.getDriverName(),taxiEntities.getCarModel(),taxiEntities.getVehicleNumber(),taxiEntities.getContact(),taxiEntities.getFreeTime(),taxiEntities.getTotalEarnings(),taxiEntities.getTaxi_id(),taxiEntities.isBooked()
				    return bean;
				};

				Converter<TaxiEntity, > suSUVvConverter = mappingContext -> {
				    Entity entity = mappingContext.getSource();
				    SuvBean bean = new SuvBean();
				    bean.setId(entity.getId());
				    bean.setName(entity.getName());
				    bean.setAge(entity.getAge());
				    bean.setSuvProperty(entity.getSuvProperty());
				    return bean;
				};

				modelMapper.typeMap(Entity.class, Taxi.class)
				        .addMappings(mapper -> {
				            mapper.when(src -> src.getCarType().equals("sedan")).setConverter(sedanConverter);
				            mapper.when(src -> src.getCarType().equals("suv")).setConverter(suvConverter);
				            // handle other cases
				        });

				List<Bean> beanList = entityList.stream()
				        .map(entity -> modelMapper.map(entity, Bean.class))
				        .collect(Collectors.toList());
		List<Taxi> taxis = taxiEntity.stream()
			    .map(taxiEntities -> {
			        Taxi taxi = new Taxi(taxiEntities.getCarType(),taxiEntities.getCurrentSpot(),taxiEntities.getDriverName(),taxiEntities.getCarModel(),taxiEntities.getVehicleNumber(),taxiEntities.getContact(),taxiEntities.getFreeTime(),taxiEntities.getTotalEarnings(),taxiEntities.getTaxi_id(),taxiEntities.isBooked());
			        // set properties of taxi from taxiEntity
			        return taxi;
			    })
			    .collect(Collectors.toList());*/
		
		for(TaxiEntity t:taxiEntity) {
			if(t.getCarType().equals("Sedan")) {
				Taxi taxi=new Sedan(t.getCarType(),t.getCurrentSpot(),t.getDriverName(),t.getCarModel(),t.getVehicleNumber(),t.getContact(),t.getFreeTime(),t.getTotalEarnings(),t.getTaxi_id(),t.isBooked());
				taxis.add(taxi);
			}
			else if(t.getCarType().equals("SUV")){
				Taxi taxi=new SUV(t.getCarType(),t.getCurrentSpot(),t.getDriverName(),t.getCarModel(),t.getVehicleNumber(),t.getContact(),t.getFreeTime(),t.getTotalEarnings(),t.getTaxi_id(),t.isBooked());
				taxis.add(taxi);
			}
			else {
				Taxi taxi=new Hatchback(t.getCarType(),t.getCurrentSpot(),t.getDriverName(),t.getCarModel(),t.getVehicleNumber(),t.getContact(),t.getFreeTime(),t.getTotalEarnings(),t.getTaxi_id(),t.isBooked());
				taxis.add(taxi);
			}
		}
		
		
		
		List<Taxi> freeTaxis = getFreeTaxis(taxis,pickupTime,pickup);
		System.out.println(freeTaxis);
        if(freeTaxis.size() == 0)
        {       double estimated_time=0.0;
				System.out.println("We are sorry to say that all are taxis are engaged at the specified time of pickup.\n");
				System.out.println("Can we suggest you some taxis nearby your location and their estimated time of interval for you reference.\n");
				String ans=sc.next();
				if(ans.equals("yes")) {
					for(Taxi t:taxis) {
						freeTaxis.add(t);
					}
					System.out.println("TAXIS AVAILABLE: \n");
			        
			        for(Taxi t:freeTaxis) {
			        	if(!t.currentSpot.equals(pickup)) {
			        		double approx_time=t.getFreeTime()+(calculateDistance(t.currentSpot,pickup)/50);
			        		approx_time = Double.parseDouble(String.format("%.2f", approx_time));
			        		 if (approx_time % 1 >= 0.6) { // check if the decimal part is 0.6
			   		    	  approx_time += 0.4; // increment by 0.4 to make it 1.0
			   		    	  approx_time = Double.parseDouble(String.format("%.2f", approx_time));
			   		    	}
			        		
			        		if(approx_time<=pickupTime) {
			        			estimated_time=pickupTime;
			        		}
			        		else {
			        			estimated_time=approx_time;
			        		}
							t.estimated_time=estimated_time;
							System.out.println(t.taxi_id+" "+t.estimated_time);
			        		//System.out.println(t.taxi_id+" DRIVER NAME: "+t.driverName+"     CAR TYPE: "+t.carType+"     CAR MODEL: "+t.carModel+"     ESTIMATED COST: "+t.calculatePayment((int)calculateDistance(pickupPoint,dropPoint))+"    ESTIMATED TIME OF ARRIVAL: "+estimated_time+" IST \n");
			        		
			        	}
						
			        }
					Collections.sort(freeTaxis, (a,b) -> Double.compare(a.getestimated_time(), b.getestimated_time()));
					List<Taxi>firstThreeTaxis=new ArrayList<>();
					firstThreeTaxis=freeTaxis.subList(0, 3);
					System.out.println(firstThreeTaxis);
					for(Taxi t:firstThreeTaxis){
						System.out.println(t.taxi_id+" DRIVER NAME: "+t.driverName+"     CAR TYPE: "+t.carType+"     CAR MODEL: "+t.carModel+"     ESTIMATED COST: "+t.calculatePayment((int)calculateDistance(pickup,destination))+"    ESTIMATED TIME OF ARRIVAL: "+t.estimated_time+" IST \n");
					}	
                      
			        Collections.sort(freeTaxis,(a,b)->a.totalEarnings - b.totalEarnings); 
			        System.out.println("Enter the preferred taxi to continue");
			        int taxiId=sc.nextInt();
			        freetaxis.clear();
			        for(Taxi t:freeTaxis) {
			        	if(taxiId==t.taxi_id) {
			        		freetaxis.add(t);
			        	}
			        	else {
			        		continue;
			        	}
			        }
		            System.out.println(freetaxis);
			        //get free Taxi nearest to us
			        bookTaxi(taxiId,pickup,destination,estimated_time,freetaxis);
				}
				
				
				else {		
                   System.out.println("No Taxi can be alloted. Exitting");
                   return;
				}
        }    

        //sort taxis based on earnings 
        Collections.sort(freeTaxis,(a,b)->a.totalEarnings - b.totalEarnings); 
        // 3,4,2 - > 2,3,4
        double estimated_time=0.0;
        System.out.println();
        
        System.out.println("AVAILABLE TAXIS AT YOUR LOCATION: \n");
        for(Taxi t:freeTaxis ) {
        	if(t.currentSpot.equals(pickup)) {
        		//double est_time=0.0;
        		if(pickupTime>t.freeTime) {
        			estimated_time=pickupTime;
        		}	
        		else {
        			estimated_time=t.freeTime;
        		}
        	System.out.println("TAXI ID: "+t.taxi_id+" DRIVER NAME: "+t.driverName+"     CAR TYPE: "+t.carType+"      CAR MODEL: "+t.carModel+"     ESTIMATED COST: "+t.calculatePayment((int)calculateDistance(pickup,destination))+"     ESTIMATED TIME OF ARIVAL: "+estimated_time+" IST \n");
        	}
        		
        	}
       
	   System.out.println("Enter the preferred taxi to continue");
        int taxiId=sc.nextInt();
		freetaxis.clear();
        for(Taxi t:freeTaxis) {
        	if(taxiId==t.taxi_id) {
        		freetaxis.add(t);
        		break;
        	}
        	else {
        		continue;
        	}
        }
        System.out.println(freetaxis);
        //get free Taxi nearest to us
        bookTaxi(taxiId,pickup,destination,estimated_time,freetaxis);
		
		
	}

}
