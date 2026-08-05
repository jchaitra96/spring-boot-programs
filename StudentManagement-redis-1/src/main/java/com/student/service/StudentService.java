package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.student.entity.StudentEntity;
import com.student.repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	StudentRepository studentRepository;
	
	@Cacheable(value = "students", key = "#name")
	public StudentEntity getStudentByName(String name)
	{
		System.out.println("fetching from db..............");
		
		return studentRepository.findByName(name).orElseThrow(() -> new RuntimeException("student not found"));
	}
	
	private void simulateSlowService()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
