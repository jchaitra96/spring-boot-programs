package com.myntra.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myntra.payment.request.PaymentRequest;
import com.myntra.payment.response.PaymentResponse;
import com.myntra.payment.service.PaymentService;

@RestController
@RequestMapping("/myntra")
public class PaymentController
{
	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/payment")
	public PaymentResponse confirmPay(@RequestBody PaymentRequest request)
	{
		return paymentService.doPayement(request);
	}

}