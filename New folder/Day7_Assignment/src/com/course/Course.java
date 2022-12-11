package com.course;

import java.util.Scanner;

public class Course {

	int courseId;
	String courseName;
	int courseFee;

	public void displayCourseDetails(Course c1) {
		
		System.out.println("-------------------------------");
		System.out.println("Course id is "+c1.courseId);
		System.out.println("Course name is "+c1.courseName);
		System.out.println("Course fees is "+c1.courseFee);
		System.out.println("-------------------------------");

	}

	public static void authenticate(String name, String paswd) {

		String username = "Admin";
		String password = "1234";

		if (name == username && paswd == password) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter course id");
			int id = sc.nextInt();

			System.out.println("Enter course name");
			String cname = sc.next();

			System.out.println("Enter course fees");
			int fee = sc.nextInt();

			Course c1 = new Course();
			c1.courseId = id;

			c1.courseName = cname;

			c1.courseFee = fee;

			c1.displayCourseDetails(c1);

		}
		
		else {
			System.out.println( "Invalid Username or password");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		authenticate("Admin", "1234");

		authenticate("Admin", "1238");

	}

}
