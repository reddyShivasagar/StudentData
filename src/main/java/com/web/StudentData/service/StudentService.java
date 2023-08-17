package com.web.StudentData.service;

import java.util.List;



import com.web.StudentData.entity.Student;


public interface StudentService {

	public Student saveStudent(Student student) ;
		
	public void deleteStudent(Integer id);
	
	public Student getStudent(Integer id);
	
	public Student updateStudent(Student student,Integer id);
	
	public List<Student> getAllStudent();
	
	
	
}

