package com.ajio.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajio.billing.request.AjioRequest;
import com.ajio.billing.service.AjioService;

@RestController
@RequestMapping("/ajio")
public class AjioController 
{
   @Autowired
   AjioService ajioService;
   
   @PostMapping("/purchase")
   public String getConfirm(@RequestBody AjioRequest ajioRequest)
   {
	   return ajioService.doPurchase(ajioRequest);
   }
}
