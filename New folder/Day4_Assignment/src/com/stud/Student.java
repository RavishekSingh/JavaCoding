package com.stud;

import com.masai.Lion;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		student1.roll = 15;
		student1.name = "Ram";
		student1.marks = 95;
		student1.displayStudentDetails();
		
		
		Student student2 = new Student();
		student2.roll = 10;
		student2.name = "Dev";
		student2.marks = 90;
		student2.displayStudentDetails();

	}

}
