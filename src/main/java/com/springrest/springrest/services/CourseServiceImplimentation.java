package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImplimentation implements CourseService {
	
	
	List<Course> list;
	

	public CourseServiceImplimentation() {
		super();
		
		list = new ArrayList<>();
		list.add(new Course(145, "java", "Basics of java"));
		list.add(new Course(146, "Spring", "Basics of Spring"));
		
	}


	@Override
	public List<Course> getCourses() {
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		
		Course course = null;
		for(Course c: list)
		{
			if(c.getId() == courseId)
			{
				course = c;
				break;
			}
		}
		return course;
	}

}
 