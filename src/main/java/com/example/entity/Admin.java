package com.example.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long admin_Id;
    private String admin_Name;
    private String admin_Email;

    @OneToMany(mappedBy = "admin")  
    @JsonIgnore
    private List<Teacher> teachers;

    @OneToMany(mappedBy = "admin")  
    @JsonIgnore
    private List<Student> students;

    public Admin() {
        super();
    }

    public Admin(Long admin_Id, String admin_Name, String admin_Email, List<Teacher> teachers, List<Student> students) {
        super();
        this.admin_Id = admin_Id;
        this.admin_Name = admin_Name;
        this.admin_Email = admin_Email;
        this.teachers = teachers;
        this.students = students;
    }

    public Admin(String admin_Name, String admin_Email, List<Teacher> teachers, List<Student> students) {
        super();
        this.admin_Name = admin_Name;
        this.admin_Email = admin_Email;
        this.teachers = teachers;
        this.students = students;
    }

    public Long getAdmin_Id() {
        return admin_Id;
    }

    public void setAdmin_Id(Long admin_Id) {
        this.admin_Id = admin_Id;
    }

    public String getAdmin_Name() {
        return admin_Name;
    }

    public void setAdmin_Name(String admin_Name) {
        this.admin_Name = admin_Name;
    }

    public String getAdmin_Email() {
        return admin_Email;
    }

    public void setAdmin_Email(String admin_Email) {
        this.admin_Email = admin_Email;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Admin [admin_Id=" + admin_Id + ", admin_Name=" + admin_Name + ", admin_Email=" + admin_Email
                + ", teachers=" + teachers + ", students=" + students + "]";
    }
}
