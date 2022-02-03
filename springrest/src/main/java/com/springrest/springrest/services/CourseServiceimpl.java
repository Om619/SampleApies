package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceimpl implements CourseService {

	List<Courses> list;
	public CourseServiceimpl()
	{
		list=new ArrayList<>();
		list.add(new Courses(145,"Java Core Course","This Course contain the java"));
		list.add(new Courses(146,"C# Courses","This Course contain the .net"));
	}
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	public Courses getCourse(long courseId)
	{
		Courses c=null;
		for(Courses course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}
	public Courses addCourse(Courses course)
	{
		list.add(course);
		return course;
	}
	public Courses updateCourse(Courses course)
	{
		list.forEach(e->{
			if(e.getId()==course.getId())
			{
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
			});
		return  course;
	}
	public void deleteCourse(long parseLong)
	{
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}
	}
