package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student addStudent(Student studentDetail) {
		return studentRepository.save(studentDetail);
	}

	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	public Student updateStudent(Long id, Student studentDetail) {
		Student existingStundent = studentRepository.findById(id).orElse(null);
		if(existingStundent != null) {
			existingStundent.setStudent_name(studentDetail.getStudent_name());
			existingStundent.setStudent_email(studentDetail.getStudent_email());
			existingStundent.setStudent_class(studentDetail.getStudent_class());
			return studentRepository.save(existingStundent);
		}
		return null;
	}

	public boolean deleteStudent(Long id) {
		 return studentRepository.findById(id).map(student -> {
	            studentRepository.delete(student);
	            return true;
	        }).orElse(false);
	}
}
