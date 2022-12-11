package com.masai;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Main {

	@Autowired
	@Qualifier("getStudents")
	private List<Student> students;
	
	@PostConstruct
	public void setUp()
	{
		System.out.println("Inside setUp method...");
		System.out.println();
	}
	@PreDestroy
	public void cleanUp()
	{
		System.out.println();
		System.out.println("Inside cleanUp method...");
	}
	
	public void showStudents()
	{
		students.forEach(s -> System.out.println(s));
	}
	
}
