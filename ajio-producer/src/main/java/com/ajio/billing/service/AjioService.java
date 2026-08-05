package com.ajio.billing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajio.billing.entity.AjioEntity;
import com.ajio.billing.producer.service.KafkaProducerService;
import com.ajio.billing.repository.AjioRepository;
import com.ajio.billing.request.AjioRequest;

import jakarta.persistence.Entity;

@Service
public class AjioService 
{
	@Autowired
	AjioRepository ajioRepository;
	
	@Autowired
	KafkaProducerService kafkaProducerService;
	
	public String doPurchase(AjioRequest ajioRequest)
	{
	AjioEntity entity= new AjioEntity();
	entity.setCustomerName(ajioRequest.getCustomerName());
	entity.setProductName(ajioRequest.getProductName());
	entity.setQuantity(ajioRequest.getQuantity());
	entity.setPrice(ajioRequest.getPrice());
	entity.setOrderStatus("order placed successfully.......");
	
	ajioRepository.save(entity);
	
	return entity.getOrderStatus();
	
	}


}
