package com.student;

public class Student {
	
	private int  rollNumber;
    private String  studentName;
	private int marks;

	public Student() {
		
	}
	
	public Student(int rollNumber, String studentName, int marks) {
		
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
		
	}
	
	public int getRoll() {
		
		return rollNumber;
	}
	
	public void setRoll(int rollNumber) {
		
		this.rollNumber = rollNumber;
	}
	
	public String getName() {
		
		return studentName;
	}
	
	public void setName(String studentName) {
		
		this.studentName = studentName;
	}
	
	public int getMarks() {
		
		return marks;
	}
	
	public void setMarks(int marks) {
		
		this.marks = marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
