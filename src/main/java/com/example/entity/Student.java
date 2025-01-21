package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long student_ID;
	private String student_name;
	private String student_email;
	private String student_class;
	
	@ManyToOne
	@JoinColumn(name = "student_admin_id")
	private Admin admin;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long student_ID, String student_name, String student_email, String student_class, Admin admin) {
		super();
		this.student_ID = student_ID;
		this.student_name = student_name;
		this.student_email = student_email;
		this.student_class = student_class;
		this.admin = admin;
	}

	public Student(String student_name, String student_email, String student_class, Admin admin) {
		super();
		this.student_name = student_name;
		this.student_email = student_email;
		this.student_class = student_class;
		this.admin = admin;
	}

	public Long getStudent_ID() {
		return student_ID;
	}

	public void setStudent_ID(Long student_ID) {
		this.student_ID = student_ID;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_email() {
		return student_email;
	}

	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

	public String getStudent_class() {
		return student_class;
	}

	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Student [student_ID=" + student_ID + ", student_name=" + student_name + ", student_email="
				+ student_email + ", student_class=" + student_class + ", admin=" + admin + "]";
	}
	
	
	
}
