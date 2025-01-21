package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student studentDetail) {
		
		return studentService.addStudent(studentDetail);
	}
	
}
