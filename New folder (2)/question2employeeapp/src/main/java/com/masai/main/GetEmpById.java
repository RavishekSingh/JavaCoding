package com.masai.main;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Employee;
import com.masai.exception.EmployeeException;

public class GetEmpById {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Get Employee Address");

		System.out.println("Enter Employee ID:");
		int empid = sc.nextInt();

		EmployeeDao dao = new EmployeeDaoImpl();

		try {
			Employee e = dao.getEmployeeById(empid);
			if(e!=null)
				System.out.println(e);
			else
				System.out.println("Employee ID not found");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

}
