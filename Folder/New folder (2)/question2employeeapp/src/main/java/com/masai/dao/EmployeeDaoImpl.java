package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.masai.entities.Employee;
import com.masai.exception.EmployeeException;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {

		//Employee emp = null;

		EntityManager em = EMUtil.provideEntityManager();

		em.getTransaction().begin();

		em.persist(employee);

		em.getTransaction().commit();

		em.close();

		return employee;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		/*
		 * Employee emp=null;
		 * 
		 * EntityManager em=EMUtil.provideEntityManager();
		 * 
		 * 
		 * emp = em.find(Employee.class, empId);
		 * 
		 * 
		 * 
		 * 
		 * return emp;
		 */

		return EMUtil.provideEntityManager().find(Employee.class, empId);
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		Employee emp = null;

		EntityManager em = EMUtil.provideEntityManager();

		emp = em.find(Employee.class, empId);

		if (emp != null) {

			em.getTransaction().begin();

			em.remove(emp);

			em.getTransaction().commit();
		}
		em.close();

		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		Employee emp = null;

		EntityManager em = EMUtil.provideEntityManager();

		emp = em.find(Employee.class, employee.getEmpId());
		if (emp == null) {
			throw new EmployeeException("Invalid Employee");
		} else {
			em.getTransaction().begin();

			em.merge(employee);

			em.getTransaction().commit();

		}
		em.close();
		return emp;
	}

}
