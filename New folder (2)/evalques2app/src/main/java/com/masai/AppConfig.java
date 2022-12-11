package com.masai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("a1.properties")
public class AppConfig {

	@Bean("theMap")
	public Map<Student, Course> getEntries() {
		Map<Student, Course> ent = new HashMap<>();

		ent.put(new Student(1, "Ram", "Pune", "ram@mail.com", 500), new Course(1, "Java", 200, 5000));
		ent.put(new Student(1, "Ram", "Pune", "ram@mail.com", 500), new Course(1, "Java", 200, 5000));
		ent.put(new Student(1, "Ram", "Pune", "ram@mail.com", 500), new Course(1, "Java", 200, 5000));
		return ent;
	}

	@Bean("theStudents")
	public List<Student> getStudents() {

		List<Student> students = new ArrayList<>();

		students.add(new Student(1, "Ram", "Pune", "ram@mail.com", 500));
		students.add(new Student(2, "Raj", "Pune", "raj@mail.com", 400));
		students.add(new Student(3, "Rohan", "Pune", "rohan@mail.com", 200));
		students.add(new Student(4, "Rohit", "Pune", "rohit@mail.com", 300));
		students.add(new Student(5, "Rahul", "Pune", "rahul@mail.com", 100));

		return students;
	}

}
