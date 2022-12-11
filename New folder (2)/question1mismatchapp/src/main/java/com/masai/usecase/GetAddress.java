package com.masai.usecase;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entities.Address;
import com.masai.entities.Customer;
import com.masai.utility.EMUtil;

public class GetAddress {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();

		Customer cst = em.find(Customer.class, 1);
		if (cst != null) {
			System.out.println(cst);
		}
		em.close();
	}

}
