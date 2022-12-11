package com.student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	public static List<Student> process(List<Student> l1, Predicate<Student> predicate) {

		List<Student> result = new ArrayList<>();
		for (Student l : l1) {
			if (predicate.test(l))
				result.add(l);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> l1 = new ArrayList<>();
		l1.add(new Student(10, "Raj", 400));
		l1.add(new Student(20, "Saj", 500));
		l1.add(new Student(30, "Viaj", 350));
		l1.add(new Student(40, "Rahul", 250));
		l1.add(new Student(50, "Ram", 600));

		// System.out.println(l1);

		List<Student> std = process(l1, (Student u) -> u.getMarks() < 500);
		System.out.println(std);

		   System.out.println("=====================================================");
		std.forEach(s -> {
			System.out.println(s);
		});
	    System.out.println("=====================================================");
		Supplier<List> val=()->(l1);
		System.out.println(val.get());

		   System.out.println("=====================================================");
		   
		   Function<String, Integer> f1=s -> Integer.parseInt(s);
		   System.out.println(f1.apply("1"));
	}

}
