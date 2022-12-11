package com.student;

import java.util.Scanner;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public void displayDetails() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter roll number");
		int roll = sc.nextInt();
		setRoll(roll);
		
		System.out.println("Enter your name");
		String name =sc.next();
		setName(name);
		
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		setMarks(marks);
		
		char grade = calculateGrade(marks);
		setGrade(grade);
		
		System.out.println("Student roll number is "+ getRoll());
		System.out.println("Student name is "+ getName());
		System.out.println("Student marks is "+ getMarks());
		System.out.println("Student grade number is "+ getGrade());
		
		System.out.println("...................................................");
	}
	
	public char calculateGrade(int marks) {
		if(marks>=500) {
			return 'A';
		}
		else if(marks<500 && marks>=400) {
			return 'B';
		}
		else {
			return 'C';
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
