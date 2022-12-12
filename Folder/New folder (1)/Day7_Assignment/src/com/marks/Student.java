package com.marks;

public class Student {

	public int roll;
	public String name;
	public int marks;

	public Student(int roll, String name, int marks) {
		// TODO Auto-generated constructor stub
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
