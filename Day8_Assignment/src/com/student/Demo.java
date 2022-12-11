package com.student;

import java.util.Scanner;

public class Demo {
int bag = 0;
	void details(Student[] students) {
		if (students != null) {
			
			System.out.println("...............................................");

			for (int i=0; i<students.length; i++) {
				System.out.println("Roll of student is :"+" "+students[i].getRoll());
				System.out.println("Name of student  is :"+" "+students[i].getName());
				System.out.println("Address of student  is :"+" "+students[i].getAddress());
				System.out.println("Marks of student  is :"+" "+students[i].getMarks());
				bag = bag+students[i].getMarks();
				System.out.println("...............................................");
				
			}
			System.out.println("Average marks of all Students :"+" "+bag/students.length);
		} else {
			System.out.println("Enter valid Student  Details");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d1 = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students to add");
		int num = sc.nextInt();
		
		
		Student[] students = new Student[num];
		for(int j=0; j<students.length; j++) {
			System.out.println("Enter Details of Student"+(j+1));
			System.out.println("Enter Roll :");
			int roll = sc.nextInt();
			System.out.println("Enter Name :");
			String name = sc.next();
			System.out.println("Enter Address :");
			String address = sc.next();
			System.out.println("Enter Marks :");
			int marks = sc.nextInt();
			students[j] = new Student(roll, name, address, marks);
		}
		d1.details(students);
	}

}
