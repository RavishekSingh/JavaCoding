package com.masai;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();

		s1.setRoll(15);
		s1.setName("Ram");
		s1.setAge(25);
		s1.setMarks(300);

		System.out.println("Roll is " + s1.getRoll());
		System.out.println("Name is " + s1.getName());
		System.out.println("Age is " + s1.getAge());
		System.out.println("Marks is " + s1.getMarks());

		System.out.println("............................................");

		Student s2 = new Student(20, "Mohan", 20, 250);

		System.out.println("Roll is " + s2.getRoll());
		System.out.println("Name is " + s2.getName());
		System.out.println("Age is " + s2.getAge());
		System.out.println("Marks is " + s2.getMarks());

	}

}
