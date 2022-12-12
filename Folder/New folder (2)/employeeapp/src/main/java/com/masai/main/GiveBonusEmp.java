package com.masai.main;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GiveBonusEmp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Give Bonus To Employee");

		System.out.println("Enter Employee ID:");
		int empid = sc.nextInt();

		System.out.println("Enter Employee Bonus:");
		int bonus = sc.nextInt();

		EmployeeDao emp = new EmployeeDaoImpl();

		String result = emp.giveBonusToEmployee(empid, bonus);

		System.out.println(result);
		System.out.println("Enter 1 to give more Employee Bonus");
		System.out.println("Enter 2 to go to main page");

		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			GiveBonusEmp.main(args);
			break;
		case 2:
			Main.main(args);
			break;
		}
	}

}
