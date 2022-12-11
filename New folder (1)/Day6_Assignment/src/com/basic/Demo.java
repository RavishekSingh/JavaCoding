package com.basic;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Student> p = s -> s.getMarks() > 500;
		System.out.println(p.test(new Student(10, "n1", 4580)));

		Supplier<Double> randomValue = () -> Math.random();
		// Print the random value using get()
		System.out.println(randomValue.get());

		// Consumer to display a number
		Consumer<Integer> display = a -> System.out.println(a);

		// Implement display using accept()
		display.accept(50);
		
		Function<Student, String> f1 = s -> s.getMarks() > 500?"Pass": "Fail";
		System.out.println(f1.apply(new Student(10, "N1", 850)));
	}

}
