package com.web.StudentData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.StudentData.entity.Student;
import com.web.StudentData.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/Save")
	public String saveStudent(@RequestBody Student std) {
		String message=null;
		
		Student s2=service.saveStudent(std);
		
		if(s2!=null) {
			message="Data is Sucessfully saved";
		}
		else {
			message="Data is not saved";
		}
		return message;
	}
	
	@DeleteMapping("/Delete/{id}")
	public void deleteStudent(@PathVariable Integer id){
		service.deleteStudent(id);
		System.out.println("**************Data deleted Sucessfully*************");
	}
	
	@GetMapping("/Get/{id}")
	public Student getStudent(@PathVariable Integer id) {
		
		return service.getStudent(id);
	}
	
	@GetMapping("/Get")
	public List<Student> getAllStudent(){
		return service.getAllStudent();
		
	}
	
	
	@PutMapping("/Update/{id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable Integer id) {
		return service.updateStudent(student, id);
		
	}
	
}
