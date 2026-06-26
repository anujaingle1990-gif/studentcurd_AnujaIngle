package com.example.studentcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.studentcrud.exception.StudentNotFoundException;

@SpringBootApplication
public class StudentcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentcrudApplication.class, args);
	}

}
