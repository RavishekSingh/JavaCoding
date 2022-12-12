package com.masai.usecase;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.entities.Product;
import com.masai.utility.EMUtil;

public class GetTotalPrice {

	public static void main(String[] args) {

	EntityManager em=EMUtil.provideEntityManager();
		
		TypedQuery<Double> q=em.createQuery("select sum(price) from Product ",Double.class);
		
		
	Double ans=q.getSingleResult();
			
		System.out.println(ans);
			em.close();
			
			System.out.println("done...");
	}

}
