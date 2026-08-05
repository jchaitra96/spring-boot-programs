package com.amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // combo of - configuration, component scan, auto configuration
public class AmazonOtpServiceApplication
{

	public static void main(String[] args) 
	{
		SpringApplication.run(AmazonOtpServiceApplication.class, args);
	}

}
