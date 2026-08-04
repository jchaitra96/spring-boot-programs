package com.ola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OlaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlaServiceApplication.class, args);
	}

}
