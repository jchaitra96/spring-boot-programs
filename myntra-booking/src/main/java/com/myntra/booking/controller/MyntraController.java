package com.myntra.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myntra.booking.request.MyntraRequest;
import com.myntra.booking.response.MyntraResponse;
import com.myntra.booking.service.MyntraService;

@RestController
@RequestMapping("/myntra")
public class MyntraController 
{
	@Autowired
	MyntraService service;
	
	@PostMapping("/orderConfirm")
	public MyntraResponse confirmOrder(@RequestBody MyntraRequest request)
	{
		return service.doOrder(request);
	}

}