package com.myntra.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myntra.payment.entity.PaymentEntity;
import com.myntra.payment.feign.MyntraFeignClient;
import com.myntra.payment.repository.PaymentRepository;
import com.myntra.payment.request.BookingRequest;
import com.myntra.payment.request.PaymentRequest;
import com.myntra.payment.response.BookingResponse;
import com.myntra.payment.response.PaymentResponse;

@Service
public class PaymentService 
{
	@Autowired
	PaymentRepository repository;
	
	@Autowired
	MyntraFeignClient client;
	
	public PaymentResponse doPayement(PaymentRequest request)
	{
		BookingRequest bookingRequest= new BookingRequest();
		
		bookingRequest.setCustomerName(request.getCustomerName());
		bookingRequest.setProductName(request.getProductName());
		bookingRequest.setQuantity(request.getQuantity());
		bookingRequest.setTotalAmount(request.getTotalAmount());
		
		BookingResponse bookingResponse=client.doOrder(bookingRequest);
		
		PaymentEntity entity= new PaymentEntity();
		entity.setAmount(request.getTotalAmount());
		entity.setPaymentMode(request.getPaymentMode());
		entity.setPaymentStatus("SUCCESS");
		
		
		repository.save(entity);
		
		PaymentResponse response= new PaymentResponse();
		response.setAmount(entity.getAmount());
		response.setPaymentMode(entity.getPaymentMode());
		response.setPaymentStatus(entity.getPaymentStatus());
		response.setPaymentId(entity.getPaymentId());
		
		return response;
				
	}

}