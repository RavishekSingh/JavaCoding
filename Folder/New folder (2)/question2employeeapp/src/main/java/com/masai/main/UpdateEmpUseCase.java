package com.masai.main;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Employee;
import com.masai.exception.EmployeeException;

public class UpdateEmpUseCase {

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDaoImpl();

		Employee emp = new Employee();
		emp.setEmpId(3);
		emp.setName("Ram");
		emp.setAddress("Goa");
		emp.setSalary(40000);

		try {
			Employee e = dao.updateEmployee(emp);
			if(e!=null)
			System.out.println("Employee Updated");
			else
				System.out.println("Employee not Found");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
