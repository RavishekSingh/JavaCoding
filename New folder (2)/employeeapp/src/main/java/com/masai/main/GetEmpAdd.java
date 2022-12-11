package com.masai.main;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GetEmpAdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Get Employee Address");

		System.out.println("Enter Employee ID:");
		int empid = sc.nextInt();

		EmployeeDao emp = new EmployeeDaoImpl();

		String result=emp.getAddressOfEmployee(empid);

		System.out.println(result);
		System.out.println("Enter 1 to get more Employee Address");
		System.out.println("Enter 2 to go to main page");

		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			GetEmpAdd.main(args);
			break;
		case 2:
			Main.main(args);
			break;
		}
	}

}
