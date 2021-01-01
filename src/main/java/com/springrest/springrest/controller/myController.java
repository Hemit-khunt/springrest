package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	
	@GetMapping("/courses/{courseId}")
	//get course from it ID field
	public Course  getCourse(@PathVariable String courseId)
	{
		
		return this.courseservice.getCourse(Long.parseLong(courseId));
	}
	
	
	@PostMapping("/courses")
	//post new course on the courses list
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseservice.addCourse(course);
	}
	
	@PutMapping("/courses")
	//Update particular course in the list
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseservice.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	//to Delete particular course
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
	{
		try {
			this.courseservice.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
	
}
