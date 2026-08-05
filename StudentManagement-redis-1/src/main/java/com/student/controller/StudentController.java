package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.StudentEntity;
import com.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	@GetMapping("{name}")
	
	public StudentEntity getStudent(@PathVariable String name)
	{
		return studentService.getStudentByName(name);
	}

}
