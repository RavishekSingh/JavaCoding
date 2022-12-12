package com.masai.main;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Employee;

public class AddNewEmp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Add New Employee");

		System.out.println("Enter new Employee ID:");
		int empid = sc.nextInt();

		System.out.println("Enter new Employee Name:");
		String name = sc.next();

		System.out.println("Enter new Employee Address:");
		String address = sc.next();

		System.out.println("Enter new Employee Salary:");
		int salary = sc.nextInt();

		EmployeeDao emp = new EmployeeDaoImpl();

		emp.save(new Employee(empid, name, address, salary));

		System.out.println("Enter 1 to add mmore new Employee");
		System.out.println("Enter 2 to go to main page");

		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			AddNewEmp.main(args);
			break;
		case 2:
			Main.main(args);
			break;
		}

	}

}
