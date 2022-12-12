package com.student;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Student> st = new LinkedHashSet<>();

		st.add(new Student(10, "Raj", 650));
		st.add(new Student(20, "Viraj", 500));
		st.add(new Student(30, "Rohan", 250));
		st.add(new Student(40, "Saj", 400));
		st.add(new Student(50, "Taj", 350));
		st.add(new Student(50, "Taj", 350));

		st.stream().filter(s -> s.getMarks() < 500).forEach(s -> System.out.println(s));

//		System.out.println(st);
//
//		Stream<Student> str1 = st.stream();
//
//		
//		Stream<Student> str2 = str1.filter(s -> s.marks < 500);
//		
//		Set<Student> modifiedList = str2.collect(Collectors.toSet());
//
//		//System.out.println(str2);
//		 modifiedList.forEach(s -> System.out.println(s));

	}

}
