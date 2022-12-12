package com.masai.main;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class DeleteEmp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Delete Employee ");

		System.out.println("Enter Employee ID:");
		int empid = sc.nextInt();

		EmployeeDao emp = new EmployeeDaoImpl();

		if (emp.deleteEmployee(empid)) {
			System.out.println("Employee Deleted");
		} else {
			System.out.println("Employee not found");
		}

		System.out.println("Enter 1 to delete more Employee");
		System.out.println("Enter 2 to go to main page");

		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			DeleteEmp.main(args);
			break;
		case 2:
			Main.main(args);
			break;
		}
	}

}
