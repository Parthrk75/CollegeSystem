package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Admin;
import com.example.entity.Student;
import com.example.entity.Teacher;
import com.example.service.AdminService;
import com.example.service.StudentService;
import com.example.service.TeacherService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    
       

    // Get all admins
    @GetMapping("/admins")
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    // Get a single admin by ID
    @GetMapping("/admins/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable Long id) {
        Admin admin = adminService.getAdminById(id);
        if (admin != null) {
            return ResponseEntity.ok(admin);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Create a new admin
    @PostMapping("/admins")
    public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin) {
        Admin newAdmin = adminService.createAdmin(admin);
        return ResponseEntity.ok(newAdmin);
    }

    // Update an existing admin
    @PutMapping("/admins/{id}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable Long id, @RequestBody Admin adminDetails) {
        Admin updatedAdmin = adminService.updateAdmin(id, adminDetails);
        if (updatedAdmin != null) {
            return ResponseEntity.ok(updatedAdmin);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete an admin
    @DeleteMapping("/admins/{id}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable Long id) {
        boolean isDeleted = adminService.deleteAdmin(id);
        if (isDeleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // ---------------------- Student Endpoints ----------------------

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudent();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        if (student != null) {
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
        Student updatedStudent = studentService.updateStudent(id, studentDetails);
        if (updatedStudent != null) {
            return ResponseEntity.ok(updatedStudent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        boolean isDeleted = studentService.deleteStudent(id);
        if (isDeleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // ---------------------- Teacher Endpoints ----------------------

    @GetMapping("/teachers")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/teachers/{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable Long id) {
        Teacher teacher = teacherService.getTeacherById(id);
        if (teacher != null) {
            return ResponseEntity.ok(teacher);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/teachers")
    public ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher) {
        Teacher newTeacher = teacherService.createTeacher(teacher);
        return ResponseEntity.ok(newTeacher);
    }

    @PutMapping("/teachers/{id}")
    public ResponseEntity<Teacher> updateTeacher(@PathVariable Long id, @RequestBody Teacher teacherDetails) {
        Teacher updatedTeacher = teacherService.updateTeacher(id, teacherDetails);
        if (updatedTeacher != null) {
            return ResponseEntity.ok(updatedTeacher);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/teachers/{id}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable Long id) {
        boolean isDeleted = teacherService.deleteTeacher(id);
        if (isDeleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
