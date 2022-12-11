package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void save(Employee emp) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		et.begin();

		em.persist(emp);

		et.commit();

		em.close();
		System.out.println("Record saved...");
	}

	@Override
	public String getAddressOfEmployee(int empId) {

		String address = "";

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		EntityManager em = emf.createEntityManager();

		Employee emp = em.find(Employee.class, empId);

		if (emp != null)
			address = "Address of " + emp.getName() + " is " + emp.getAddress();
		else
			address = "Employee not found";

		em.close();

		return address;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {

		String message = "";

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		EntityManager em = emf.createEntityManager();

		Employee emp = em.find(Employee.class, empId);

		if (emp != null) {
			em.getTransaction().begin();

			emp.setSalary(emp.getSalary() + bonus);

			em.getTransaction().commit();

			message = "Bonus given to " + emp.getName();
		} else {
			message = "Employee not found";
		}
		em.close();
		return message;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean flag = true;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		Employee emp = em.find(Employee.class, empId);

		if (emp != null) {
			et.begin();

			em.remove(emp);

			et.commit();
		} else {
			flag = false;
		}

		em.close();

		return flag;
	}

}
