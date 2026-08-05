package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.EmployeeEntity;
import com.employee.repository.EmployeeRepository;
import com.employee.request.EmployeeRequest;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepository employeeRepository;
	
	public String addEmployeeDetails(EmployeeRequest request)
	{
		EmployeeEntity entity = new EmployeeEntity();
		
		entity.setEmployeeName(request.getEmployeeName());
		entity.setDepartment(request.getDepartment());
		entity.setSalary(request.getSalary());
		
		employeeRepository.save(entity);
		
		return "employee details added successfully";
		
	}

}
