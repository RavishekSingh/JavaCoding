package com.student;

public class Student {

	public int roll;
	public  String name;
	public  String email;
	public  int marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String email, int marks) {

		this.roll = roll;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}

	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
