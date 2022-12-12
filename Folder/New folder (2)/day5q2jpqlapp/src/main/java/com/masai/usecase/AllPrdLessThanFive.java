package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.entities.Product;
import com.masai.utility.EMUtil;

public class AllPrdLessThanFive {

	public static void main(String[] args) {

	EntityManager em=EMUtil.provideEntityManager();
		
		TypedQuery<Product> q=em.createQuery("from Product where quantity<5",Product.class);
		
		
	List<Product> ans=q.getResultList();
			
		System.out.println(ans);
			em.close();
			
			System.out.println("done...");
	}

}
