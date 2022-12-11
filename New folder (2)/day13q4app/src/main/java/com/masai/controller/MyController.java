package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;

//@Controller
@RestController
public class MyController {

	@RequestMapping("/employee")
	public Employee getEmployee() {

		Employee emp = new Employee(1, "Ram", "Pune", 50000);
		return emp;
	}

	@RequestMapping("/employees")
	public List<Employee> getEmployees() {

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1,"Ram","Pune",50000));
		emp.add(new Employee(2,"Raj","Chennai",60000));
		emp.add(new Employee(3,"Rahul","Kolkata",40000));
		emp.add(new Employee(4,"Ramit","Mumbai",80000));
		emp.add(new Employee(5,"Ramesh","Ranchi",70000));
		return emp;
	}

	@RequestMapping("/hello")
	// @ResponseBody
	public String myWelcomeService() {
		return "Welcome to Spring Boot";
	}

}
