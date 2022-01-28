package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;

@RestController
public class myController {
	
	
	@GetMapping("/courses")
	// Get the Courses
	public List<Course > getCourses()
	{
		
		
	}
}
