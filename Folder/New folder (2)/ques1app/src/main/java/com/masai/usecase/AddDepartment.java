package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Department;

public class AddDepartment {

	public static void main(String[] args) {
	

	
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Department dep=new Department();
		dep.setDeptName("HR");
		dep.setLocation("Pune");
		
		dao.addDepartment(dep);

	}

}
