package com.student.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class StudentEntity
{
	@Id
	private String id;
	private String name;
	private String course;
	private int courseDuration;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	

}
