package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Teacher;
import com.example.repository.TeacherRepository;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    // Get all teachers
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    // Get teacher by ID
    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    // Create a new teacher
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    // Update a teacher
    public Teacher updateTeacher(Long id, Teacher teacherDetails) {
        return teacherRepository.findById(id).map(teacher -> {
        	teacher.setTeacher_name(teacherDetails.getTeacher_name());
            teacher.setTeacher_Department(teacherDetails.getTeacher_Department());
            teacher.setTeacher_email(teacherDetails.getTeacher_email());
            // Update other fields as needed
            return teacherRepository.save(teacher);
        }).orElse(null);
    }

    // Delete a teacher
    public boolean deleteTeacher(Long id) {
        return teacherRepository.findById(id).map(teacher -> {
            teacherRepository.delete(teacher);
            return true;
        }).orElse(false);
    }
}

