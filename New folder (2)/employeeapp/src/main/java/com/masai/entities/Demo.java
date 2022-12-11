//package com.masai.entities;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class Demo {
//
//	public static void main(String[] args) {
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
//
//		EntityManager em = emf.createEntityManager();
//
////		Employee emp = em.find(Employee.class, 30);
////
////		if (emp != null)
////			System.out.println(emp);
////		else
////			System.out.println("Employee does not exist");
////
////		em.close();
//
//		Employee emp = new Employee(30, "Raj", "Chennai", 50000);
//
//		EntityTransaction et = em.getTransaction();
//
//		et.begin();
//
//		em.persist(emp);
//
//		et.commit();
//
//		em.close();
//		System.out.println("Record saved...");
//
//	}
//
//}
