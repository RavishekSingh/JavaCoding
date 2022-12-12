package com.masai.main;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Employee;
import com.masai.exception.EmployeeException;

public class RegisterEmpUseCase {

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDaoImpl();

		Employee emp = new Employee();
		emp.setName("Sam");
		emp.setAddress("Goa");
		emp.setSalary(45000);

		try {
			Employee e = dao.registerEmployee(emp);
			if(e!=null)
			System.out.println("Employee registered");
			else
				System.out.println("Employee not registered");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
