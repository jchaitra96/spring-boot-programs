package com.myntra.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myntra.booking.entity.MyntraEntity;
import com.myntra.booking.repository.MyntraRepository;
import com.myntra.booking.request.MyntraRequest;
import com.myntra.booking.response.MyntraResponse;

@Service
public class MyntraService
{
	@Autowired
	MyntraRepository repository;

	
	public MyntraResponse doOrder(MyntraRequest request)
	{
		MyntraEntity entity=new MyntraEntity();
		
		entity.setCustomerName(request.getCustomerName());
		entity.setProductName(request.getProductName());
		entity.setQuantity(request.getQuantity());
		entity.setTotalAmount(request.getTotalAmount());
		
		repository.save(entity);
		
		MyntraResponse response= new MyntraResponse();
		
		response.setCustomerName(entity.getCustomerName());
		response.setProductName(entity.getProductName());
		response.setQuantity(entity.getQuantity());
		response.setTotalAmount(entity.getTotalAmount());
		
		return response;
	}

}