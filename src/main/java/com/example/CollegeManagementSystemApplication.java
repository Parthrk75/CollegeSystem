package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.entity","com.example.controller", "com.example.service", "com.example.repository"})
public class CollegeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeManagementSystemApplication.class, args);
	}

}
