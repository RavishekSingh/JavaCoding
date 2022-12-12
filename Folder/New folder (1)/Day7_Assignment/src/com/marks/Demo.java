package com.marks;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> st = new ArrayList<>();

		st.add(new Student(10, "Raj", 450));
		st.add(new Student(20, "Viraj", 500));
		st.add(new Student(30, "Rohan", 250));
		st.add(new Student(40, "Saj", 400));
		st.add(new Student(50, "Taj", 350));
		
		Student maxStudent= st
				.stream()
				.min((s1,s2) -> s1.marks < s2.marks ? +1: -1)
				.get();
		
		
		
		System.out.println(maxStudent);

	}

}
