package com.student;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class StudentManagementRedis1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementRedis1Application.class, args);
	}

}
