package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entities.Address;

import com.masai.entities.Customer;

import com.masai.utility.EMUtil;

public class GetAddress {

	public static void main(String[] args) {

		EntityManager em=EMUtil.provideEntityManager();
		
	Customer cs=em.find(Customer.class,2);
		
		List<Address> add=cs.getAdr();
		
		add.forEach(s->{
			
			System.out.println(s.getState());
			System.out.println(s.getCity());
			System.out.println(s.getPincode());
			
			System.out.println("=====================================");
		});
	}

}
