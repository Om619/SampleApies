package com.student.service;

import java.util.List;
import java.util.Optional;

import com.student.details.StudentDetails;

public interface StudentService {
	
	public List<StudentDetails> getDetails();
	public StudentDetails addStudentDetails(StudentDetails details);
//	public StudentDetails getStudent( String id);
	public StudentDetails updateDetails( StudentDetails details);
	public void deleteDetails(Long parLong);
	Optional<StudentDetails> getStudent(long id);
}
