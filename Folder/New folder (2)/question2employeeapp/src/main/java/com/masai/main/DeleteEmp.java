package com.masai.main;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Employee;
import com.masai.exception.EmployeeException;

public class DeleteEmp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Delete Employee ");

		System.out.println("Enter Employee ID:");
		int empid = sc.nextInt();

		EmployeeDao dao = new EmployeeDaoImpl();

		try {
			Employee e = dao.deleteEmployeeById(empid);
			if(e!=null)
			System.out.println("Employee Deleted");
			else
				System.out.println("Employee ID not found");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
