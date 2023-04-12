package com.uc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uc.businessbean.Taxi;
import com.uc.dao.Taxidao;
import com.uc.entity.TaxiEntity;


@Service
public class RideBookingServiceImpl implements RideBookingService{
    @Autowired
	Taxidao tdao;
	
	List<Taxi>taxis=new ArrayList<>();
	
	
	@Override
	public void bookaRide(String pickup, String destination, double pickupTime) {
		
		List<TaxiEntity>taxiEntity=new ArrayList<>();
		taxiEntity=tdao.findAll();
		System.out.println(taxiEntity);
		
	}

}
