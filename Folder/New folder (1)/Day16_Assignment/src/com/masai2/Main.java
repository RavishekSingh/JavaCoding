package com.masai2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Employee> emp = new TreeSet<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Add Employee Details");

		for (int i = 0; i < 4; i++) {
			System.out.println("Enter employee id");
			int id = sc.nextInt();

			System.out.println("Enter employee name");
			String name = sc.next();

			System.out.println("Enter employee salary");
			double sal = sc.nextDouble();

			emp.add(new Employee(id, name, sal));
		}
		
		for(Employee p:emp) {
			System.out.println(p);
		}

	}

}
