package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.request.EmployeeRequest;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController
{
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/details")
	public String employeeDetails(@RequestBody EmployeeRequest request)
	{
 
		return employeeService.addEmployeeDetails(request);

	}

}
