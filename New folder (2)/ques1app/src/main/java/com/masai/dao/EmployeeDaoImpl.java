package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.exception.DepartmentException;
import com.masai.exception.EmployeeException;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void addDepartment(Department dept) {
		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();
		em.close();
		
		System.out.println("done");
		
	}

	@Override
	public void addEmployee(Employee emp) {
		
		
EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		em.close();
		
		System.out.println("done");
		
	}

	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
