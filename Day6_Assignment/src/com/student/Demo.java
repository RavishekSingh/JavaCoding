package com.student;

public class Demo {

	public static void main(String[] args) {

		Student s1 = Student.getStudent(true);
		System.out.println("Roll is :" + s1.roll);
		System.out.println("Name is :" + s1.name);
		System.out.println("Address is :" + s1.address);
		System.out.println("CollegeName is :" + s1.collegeName);

		System.out.println(".....................................");

		Student s2 = Student.getStudent(false);
		System.out.println("Roll is :" + s2.roll);
		System.out.println("Name is :" + s2.name);
		System.out.println("Address is :" + s2.address);
		System.out.println("CollegeName is :" + s2.collegeName);
	}

}
