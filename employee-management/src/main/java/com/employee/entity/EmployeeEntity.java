package com.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_management")
public class EmployeeEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String employeeName;
	private String department;
	private int salary;
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) 
	{
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() 
	{
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	
	public String getDepartment() 
	{
		return department;
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	
	
	

}
