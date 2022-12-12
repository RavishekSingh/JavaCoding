package com.employee;

import java.util.Scanner;

public class Main {
	
	public static Employee getEmployeeDetails(int num, String name, int num1,int num2) {
		
		this.id= num;
		this.name = name;
		this.salary = num1;
		this.pf= num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter id");
		int num = sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Enter salary");
		int num1 = sc.nextInt();
		
		System.out.println("Enter PF");
		int num2 = sc.nextInt();
		
		
		Employee e1 = new Employee()

	}

}
