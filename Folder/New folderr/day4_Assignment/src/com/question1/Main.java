package com.question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		StudentServiceImpl dao = new StudentServiceImpl();
		dao.list.add(new Student(1, "Arun", 400, "A", new Address("Kolkata", "West Bengal", 12345)));
		dao.list.add(new Student(2, "Manoj", 550, "B", new Address("Kolkata", "West Bengal", 12345)));
		dao.list.add(new Student(3, "Mohit", 650, "C", new Address("Kolkata", "West Bengal", 12345)));
		dao.list.add(new Student(4, "Saroj", 350, "D", new Address("Kolkata", "West Bengal", 12345)));
		dao.list.add(new Student(5, "Sam", 300, "E", new Address("Kolkata", "West Bengal", 12345)));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter the ID");
			int id = sc.nextInt();
			System.out.println("Enter the Name");
			String name = sc.next();
			System.out.println("Enter the Marks");
			int marks = sc.nextInt();
			System.out.println("Enter the Section");
			String section = sc.next();

			System.out.println("Enter the City");
			String city = sc.next();
			System.out.println("Enter the State");
			String state = sc.next();
			System.out.println("Enter the pincode");
			int code = sc.nextInt();
			Student st = dao.addStudent(new Student(id, name, marks, section, new Address(city, state, code)));
			System.out.println(st + " Added");

			break;

		case 2:
			System.out.println("Enter the ID");
			int ids = sc.nextInt();
			dao.deleteStudent(ids);
			break;
		case 3:
			System.out.println("Enter the ID");
			int ids1 = sc.nextInt();
			dao.findStudent(ids1);
			break;
		case 4:
			HashSet<Student> hs = dao.setOfMarks();
			hs.forEach(s -> System.out.println(s));
			break;
		case 5:
			List<Student> ls = dao.sortWithName();
			ls.forEach(s -> System.out.println(s));
			break;
		case 6:
			List<Student> list = new ArrayList<>();
			System.out.println("Enter the number of students want to add");
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.println("Enter the ID");
				int ids2 = sc.nextInt();
				System.out.println("Enter the Name");
				String name1 = sc.next();
				System.out.println("Enter the Marks");
				int marks1 = sc.nextInt();
				System.out.println("Enter the Section");
				String section1 = sc.next();

				System.out.println("Enter the City");
				String city1 = sc.next();
				System.out.println("Enter the State");
				String state1 = sc.next();
				System.out.println("Enter the pincode");
				int code1 = sc.nextInt();
				list.add(new Student(ids2, name1, marks1, section1, new Address(city1, state1, code1)));

				System.out.println("---------------------------------------------------------------------------------");

			}
			dao.addAllStudents(list);
			break;

		case 7:
			System.out.println("Enter the pincode");
			int code12 = sc.nextInt();
			dao.findStudentWithPincode(code12);
			break;

		}

	}

}
