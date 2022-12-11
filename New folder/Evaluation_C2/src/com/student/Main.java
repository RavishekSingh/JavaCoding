package com.student;

import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		
		System.out.println("Enter Number of Students you want to enter");
		int num = sc.nextInt();
	
		System.out.println("Enter roll no");
		int roll = sc.nextInt();
		
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		
		Student s1 = new Student(roll,name,marks);
		
//		s1.setRoll(roll);
//		s1.setName(name);
//		s1.setMarks(marks);
		
	
		
		
		System.out.println("Student Roll Number:"+s1.getRoll());
		System.out.println("Student Name:"+s1.getName());
		System.out.println("Student Mark:"+s1.getMarks());
		
	
	}

}
