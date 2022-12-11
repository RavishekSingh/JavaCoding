package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("cities.properties")
public class AppConfig {

	@Autowired
	private Environment evn;
	
	@Bean
	public List<String> getCities()
	{
		List<String> cities = new ArrayList<>();
		
		cities.add(evn.getProperty("c1"));
		cities.add(evn.getProperty("c2"));
		cities.add(evn.getProperty("c3"));
		cities.add(evn.getProperty("c4"));
		cities.add(evn.getProperty("c5"));
		
		return cities;
	}
	
	
	@Bean
	public List<Student> getStudents()
	{
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1, "Raj", 500));
		students.add(new Student(2, "Ram", 400));
		students.add(new Student(3, "Rohan", 600));
		students.add(new Student(4, "Raju", 300));
		students.add(new Student(5, "Ramit", 450));
		
		return students;
	}
}
