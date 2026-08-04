package com.ola.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ola.entity.OlaEntity;
import com.ola.repository.OlaRepository;
import com.ola.request.OlaRequest;
import com.ola.response.OlaResponse;

@Service
public class OlaService 
{
	@Autowired
	OlaRepository repository;
	
	public OlaResponse doBooking(OlaRequest olaRequest)
	{
		OlaEntity entity=new OlaEntity();
		entity.setCustomerName(olaRequest.getCustomerName());
		entity.setPickupLocation(olaRequest.getPickupLocation());
		entity.setDropLocation(olaRequest.getDropLocation());
		entity.setVehicleType(olaRequest.getVehicleType());
		entity.setFare(olaRequest.getFare());
		entity.setBookingStatus("booked successfully.......");
		
		repository.save(entity);
		
		OlaResponse response = new OlaResponse();
		 response.setServiceId(generateServiceId());
		 response.setDriverName(generateDriverName());
		 response.setFare(entity.getFare());
		 response.setBookingStatus(entity.getBookingStatus());
		
		 return response;
	}
	
	
	
	private int generateServiceId() {
	    Random random = new Random();
	    return 100 + random.nextInt(900);
	}
	
	private String generateDriverName() {
	    Random random = new Random();
	    StringBuilder name = new StringBuilder();

	    for (int i = 0; i < 3; i++) {
	        char ch = (char) ('A' + random.nextInt(26));
	        name.append(ch);
	    }

	    return name.toString();
	}
	

}
