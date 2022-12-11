package com.masai.usecase;

import javax.persistence.EntityManager;

import com.masai.entities.Address;
import com.masai.entities.Customer;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {

		EntityManager em=EMUtil.provideEntityManager();
		
		Customer cs=new Customer();
		
		cs.setName("Ram");
		cs.setMobileNumber(12345);
		cs.setEmail("ram@gmail.com");
		cs.getAddresses().add(new Address("Maharashtra","Mumbai","1234","Home"));
		cs.getAddresses().add(new Address("Tamil Nadu","Chennai","5234","Office"));
		cs.getAddresses().add(new Address("Jharkhand","Ranchi","6234","FarmHouse"));

		em.getTransaction().begin();
		
		em.persist(cs);
		
		em.getTransaction().commit();
		
		System.out.println("done");
		
		em.close();
	}

}
