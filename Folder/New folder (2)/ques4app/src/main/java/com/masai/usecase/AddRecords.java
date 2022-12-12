package com.masai.usecase;

import javax.persistence.EntityManager;

import com.masai.entities.ContractualEmployee;
import com.masai.entities.Employee;
import com.masai.entities.SalariedEmployee;
import com.masai.utility.EMUtil;

public class AddRecords {

	public static void main(String[] args) {

		EntityManager em=EMUtil.provideEntityManager();
		
		Employee e1=new Employee();
		e1.setEmpName("Ram");
		
		SalariedEmployee s1=new SalariedEmployee();
		s1.setEmpName("Raj");
		s1.setSalary(40000);
		s1.setEmail("raj@gmail.com");
		
		ContractualEmployee c1=new ContractualEmployee();
		c1.setEmpName("Mohan");
		c1.setNoOfWorkingDays(20);
		c1.setCostofperday(20);
		c1.setMobileNumber("12452");
		
		Employee e2=new Employee();
		e2.setEmpName("Varun");
		
		SalariedEmployee s2=new SalariedEmployee();
		s2.setEmpName("Rakesh");
		s2.setSalary(40000);
		s2.setEmail("rakesh@gmail.com");
		
		ContractualEmployee c2=new ContractualEmployee();
		c2.setEmpName("Mohit");
		c2.setNoOfWorkingDays(20);
		c2.setCostofperday(20);
		c2.setMobileNumber("72452");
		
		Employee e3=new Employee();
		e3.setEmpName("Viraj");
		
		SalariedEmployee s3=new SalariedEmployee();
		s3.setEmpName("Ramit");
		s3.setSalary(40000);
		s3.setEmail("ramit@gmail.com");
		
		ContractualEmployee c3=new ContractualEmployee();
		c3.setEmpName("Manoj");
		c3.setNoOfWorkingDays(20);
		c3.setCostofperday(20);
		c3.setMobileNumber("82452");
		
		Employee e4=new Employee();
		e4.setEmpName("Saket");
		
		SalariedEmployee s4=new SalariedEmployee();
		s4.setEmpName("Sohan");
		s4.setSalary(40000);
		s4.setEmail("sohan@gmail.com");
		
		ContractualEmployee c4=new ContractualEmployee();
		c4.setEmpName("Mridul");
		c4.setNoOfWorkingDays(20);
		c4.setCostofperday(20);
		c4.setMobileNumber("52452");
		em.getTransaction().begin();
		
		em.persist(e1);
		em.persist(s1);
		em.persist(c1);
		em.persist(e2);
		em.persist(s2);
		em.persist(c2);
		em.persist(e3);
		em.persist(s3);
		em.persist(c3);
		em.persist(e4);
		em.persist(s4);
		em.persist(c4);
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("done");
	}

}
