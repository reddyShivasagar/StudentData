package com.web.StudentData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.web.StudentData.entity.Student;
import com.web.StudentData.repository.StudentRepository;

@Service
public class StudentServiceImplements implements StudentService {

	@Autowired
	private StudentRepository repository;
	
	@Override
	public Student saveStudent(Student student) {
	
		Student s2=repository.save(student);
		return s2;
	}

	@Override
	public void deleteStudent(Integer id) {
	     repository.deleteById(id);

		
	}

	@Override
	public Student getStudent(Integer id) {
		Student s1= repository.findById(id).get();
		return s1;
	}

	@Override
	public List<Student> getAllStudent() {
	List<Student> list=repository.findAll();
	return list;

	}

	@Override
	public Student updateStudent(Student student, Integer id) {
		
		Student student2=repository.findById(id).get();
		
		student2.setId(id);
		student2.setName(student.getName());
		
		return repository.save(student2);
	}

	

}
