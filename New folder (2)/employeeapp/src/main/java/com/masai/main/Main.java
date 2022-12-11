package com.masai.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To Employee App");
		System.out.println("Select option to continue");
		System.out.println("Enter 1 to add new Employee");
		System.out.println("Enter 2 to get Employee's Address");
		System.out.println("Enter 3 to give bonus to Employee");
		System.out.println("Enter 4 to delete a Employee");
		System.out.println("Enter 5 to Close the App");

		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			AddNewEmp.main(args);
			break;
		case 2:
			GetEmpAdd.main(args);
			break;
		case 3:
			GiveBonusEmp.main(args);
			break;
		case 4:
			DeleteEmp.main(args);
			break;
		case 5:
			System.out.println("Thank You...");
			break;
		}
	}

}
