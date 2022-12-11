package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> st = new ArrayList<>();
	
		st.add(new Student(10, "Raj", 600, "Pune"));
		st.add(new Student(20, "Saj", 400, "Goa"));
		st.add(new Student(30, "Viraj", 700, "Mumbai"));
		st.add(new Student(40, "Taj", 500, "Delhi"));
		st.add(new Student(50, "Ram", 800, "Kolkata"));
		
		List<Employee> l1=st.stream().filter(s->s.getMarks()>500)
				                                 .map(s->new Employee(s.getRoll(),s.getName(),s.getMarks()*10000,s.getAddress()))
				                                .collect(Collectors.toList());
		
		l1.forEach(s->System.out.println(s));

	}

}
