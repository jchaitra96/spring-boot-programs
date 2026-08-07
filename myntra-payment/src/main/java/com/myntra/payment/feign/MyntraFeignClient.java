package com.myntra.payment.feign;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.myntra.payment.request.BookingRequest;
import com.myntra.payment.response.BookingResponse;

@FeignClient(name="myntra-booking")
public interface MyntraFeignClient 
{
	@PostMapping("/myntra/orderConfirm")
	BookingResponse doOrder(@RequestBody BookingRequest request);

}