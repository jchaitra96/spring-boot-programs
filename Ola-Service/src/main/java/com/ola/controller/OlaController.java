package com.ola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ola.request.OlaRequest;
import com.ola.response.OlaResponse;
import com.ola.service.OlaService;

@RestController
@RequestMapping("/ola")
public class OlaController 
{
	@Autowired OlaService olaService;
	
	@PostMapping("/booking")
	public OlaResponse getBookingDetails(@RequestBody OlaRequest olaRequest)
	{
		return olaService.doBooking(olaRequest);
	}

}
