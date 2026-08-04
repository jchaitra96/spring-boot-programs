package com.train.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.train.booking.request.TrainRequest;
import com.train.booking.response.TrainResponse;
import com.train.booking.service.TrainService;

@RestController
@RequestMapping("/train/booking/")
public class TrainController 
{
	@Autowired
	TrainService trainService;
	
	@GetMapping("gettickets")
	public List<TrainResponse> getTicket(@RequestParam String userId, @RequestParam String page,
			@RequestParam String records)
	{
		return trainService.getAllTickets(userId, page, records);
		
	}

	@PostMapping("confirmtrainticket")
	public TrainResponse doBooking(@RequestBody TrainRequest request)
	{
		return trainService.doBooking(request);
	}

}
