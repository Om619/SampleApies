package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to Mox Asylum";
	}
	//get the courses
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		return this.courseService.getCourses();
	}
	@GetMapping("/coures/{courseId}")
	public Courses getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course)
	{
		return this.courseService.addCourse(course);
	}
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses course)
	{
		return this.courseService.updateCourse(course);
	}
	@DeleteMapping("/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId)
	{
	 this.courseService.deleteCourse(Long.parseLong(courseId));
	}
}
