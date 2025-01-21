package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long teacher_id;
	private String teacher_name;
	private String teacher_email;
	private String teacher_Department;
	
	@ManyToOne
	@JoinColumn(name = "teacher_admin_id")
	private Admin admin;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(Long teacher_id, String teacher_name, String teacher_email, String teacher_Department, Admin admin) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_email = teacher_email;
		this.teacher_Department = teacher_Department;
		this.admin = admin;
	}

	public Teacher(String teacher_name, String teacher_email, String teacher_Department, Admin admin) {
		super();
		this.teacher_name = teacher_name;
		this.teacher_email = teacher_email;
		this.teacher_Department = teacher_Department;
		this.admin = admin;
	}

	public Long getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(Long teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getTeacher_email() {
		return teacher_email;
	}

	public void setTeacher_email(String teacher_email) {
		this.teacher_email = teacher_email;
	}

	public String getTeacher_Department() {
		return teacher_Department;
	}

	public void setTeacher_Department(String teacher_Department) {
		this.teacher_Department = teacher_Department;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", teacher_email="
				+ teacher_email + ", teacher_Department=" + teacher_Department + ", admin=" + admin + "]";
	}

	
	
	
}
