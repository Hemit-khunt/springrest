package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class myController {
	
	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/courses")
	// Get the Courses
	public List<Course > getCourses()
	{
		
		return this.courseservice.getCourses();
	}
}
