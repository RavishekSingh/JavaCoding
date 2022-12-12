package com.masai.usecase;

import javax.persistence.EntityManager;

import com.masai.entities.Address;
import com.masai.entities.Customer;
import com.masai.utility.EMUtil;

public class AddCustomer {

	public static void main(String[] args) {

		EntityManager em=EMUtil.provideEntityManager();
		
		Customer c1=new Customer("Ram","12345","ram@mail.com");
		c1.getAdr().add(new Address("Maharashtra","Mumbai","12014","Home"));
		c1.getAdr().add(new Address("TamilNadu","Chennai","5412","Office"));

		Customer c2=new Customer("Raj","72345","raj@mail.com");
		c2.getAdr().add(new Address("Karnataka","Bangalore","42014","Home"));
		c2.getAdr().add(new Address("West Bengal","Kolkata","8412","Office"));
	
		em.getTransaction().begin();
		
		em.persist(c1);
		em.persist(c2);
		
		em.getTransaction().commit();
	
		em.close();
		
		System.out.println("done");
	}

}
