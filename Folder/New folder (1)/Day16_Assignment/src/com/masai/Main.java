package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	List<Employee> emp = new ArrayList<>();

	public static void main(String[] args) {

		Main m1 = new Main();

		Scanner sc = new Scanner(System.in);
		System.out.println("...Welcome to Employee Management System..");

		int j = 1;
		while (true) {
			System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
			String ch = sc.next();
			if (ch.equalsIgnoreCase("Y")) {
				System.out.println();
				System.out.println("Enter the Employee Details: " + j);
				System.out.println("``````````````````````````````");

				System.out.println("Enter the Employee Id:");
				int id = sc.nextInt();

				sc.nextLine();
				System.out.println("Enter the Employee Name:");
				String name = sc.nextLine();

				System.out.println("Enter the Employee Salary:");
				double salary = sc.nextDouble();

				System.out.println("Enter the Department Id:");
				int dId = sc.nextInt();

				sc.nextLine();
				System.out.println("Enter the Department Name:");
				String dName = sc.nextLine();

				if(m1.emp.size()==0) {
					m1.emp.add(new Employee(id, name, salary, new Department(dId, dName)));
					System.out.println("Employee Details added successfully...");
					System.out.println();
					j++;
				}
				else {
					boolean flag=false;
					for(int n=0;n<m1.emp.size();n++) {
						if(m1.emp.get(n).equals(new Employee(id, name, salary, new Department(dId, dName)))) {
							flag=true;
							break;
						}
					}
					if(flag=false) {
						m1.emp.add(new Employee(id, name, salary, new Department(dId, dName)));
						System.out.println("Employee Details added successfully...");
						System.out.println();
						j++;
					}
				}
				

			} else {
				System.out.println("Thank you--");
				break;
			}
		}

		while (true) {
			System.out.println("Enter the your choice\r\n" + "1: Find Employee in Particular Department\r\n"
					+ "2: Remove Particular Employee\r\n" + "3: Print Employees in All Departments\r\n" + "");
			int n = sc.nextInt();

			if (n == 1) {
				System.out.println("Enter the Department Id:\r\n" + "");
				int id = sc.nextInt();
				for (int i = 0; i < m1.emp.size(); i++) {
					if (m1.emp.get(i).getDepartment().getDepartmentId() == id) {
						System.out.println("Employee in department id" + " " + id);
						System.out.println(m1.emp.get(i).getEmployeeName());
						System.out.println(m1.emp.get(i).getEmployeeId());
						System.out.println(m1.emp.get(i).getEmployeeSalary());
					}
				}
			} else if (n == 2) {
				System.out.println("Enter department id");
				int id = sc.nextInt();
				System.out.println("Enter employee id");
				int eid = sc.nextInt();
				for (int k = 0; k < m1.emp.size(); k++) {
					if (m1.emp.get(k).getDepartment().getDepartmentId() == id && m1.emp.get(k).getEmployeeId() == eid) {

						System.out.println(m1.emp.get(k).getEmployeeName() + "Employee is removed from the+" + " " + id
								+ " successfully.");
						m1.emp.remove(k);
					}
				}
			} else {
				for (Employee p : m1.emp) {
					System.out.println(p);
					System.out.println("============================================");
				}
			}
			System.out.println("Do you want to Exit: ? (Y/N)\r\n" + "");
			String ans = sc.next();
			if (ans.equalsIgnoreCase("N")) {
				continue;
			} else {
				System.out.println("Thankyou..");
				break;
			}
		}

	}

}
