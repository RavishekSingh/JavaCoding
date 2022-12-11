package com.student;

public class Student {

	int roll;
	String name;
	String address;
	String collegeName;

	Student(int roll, String name, String address) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = "NIT";
	}

	Student(int roll, String name, String address, String collegeName) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = collegeName;
	}

	public static Student getStudent(boolean isFromNIT) {
		if (isFromNIT == true) {
			Student s1 = new Student(15, "Ramesh", "Mumbai");
			return s1;
		} else {
			Student s1 = new Student(18, "Suresh", "Delhi", "DTU");
			return s1;
		}

	}

}
