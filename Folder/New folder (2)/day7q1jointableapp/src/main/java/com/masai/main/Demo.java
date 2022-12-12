package com.masai.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.masai.entities.Address;
import com.masai.entities.Employee;
import com.masai.entities.Person;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {

		EntityManager em=EMUtil.provideEntityManager();
		
        List<Address> add1 = new ArrayList<>();
		
		Person person1 = new Person("Ram");
		add1.add(new Address("Maharashtra", "Mumbai", "534623", "HomeAdd"));
		add1.add(new Address("TamilNadu", "Chennai", "534623", "OfficeAdd"));
		
		Employee employee1 = new Employee(add1, 50000);
		employee1.setName("Rahul");
		
		List<Address> add2 = new ArrayList<>();
		
		Person person2 = new Person("Rohit");
		add2.add(new Address("Jharkhand", "Ranchi", "534623", "HomeAdd"));
		add2.add(new Address("MP", "Indore", "466623", "OfficeAdd"));
		
		Employee employee2 = new Employee(add2, 55000);
		employee2.setName("Mohan");
		
		em.getTransaction().begin();
		
		em.persist(person1);
		em.persist(employee1);
		
		em.persist(person2);
		em.persist(employee2);
		
		em.getTransaction().commit();
		
		em.close();
		
		
		
		System.out.println("done...");
	}

}
