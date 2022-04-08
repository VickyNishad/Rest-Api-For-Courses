package com.course;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class CoursesApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CoursesApplication.class, args);
	
	}
}
