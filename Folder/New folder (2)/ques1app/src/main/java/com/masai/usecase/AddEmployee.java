package com.masai.usecase;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Address;
import com.masai.entities.Department;
import com.masai.entities.Employee;

public class AddEmployee {

	public static void main(String[] args) {

		EmployeeDao dao=new EmployeeDaoImpl();
		
		Employee emp=new Employee();
	emp.setEmpName("Rohan");
	emp.setSalary(40000);
	emp.setAddress(new Address("Mumbai","Maharashtra","1245"));
	dao.addEmployee(emp);

	}

}
