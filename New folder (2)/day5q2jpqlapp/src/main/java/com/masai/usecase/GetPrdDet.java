package com.masai.usecase;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.entities.Product;
import com.masai.utility.EMUtil;

public class GetPrdDet {

	public static void main(String[] args) {


		EntityManager em=EMUtil.provideEntityManager();
		
		TypedQuery<Product> q=em.createQuery("from Product where productId=:id",Product.class);
		q.setParameter("id", 1);
		
	Product ans=q.getSingleResult();
			
		System.out.println(ans);
			em.close();
			
			System.out.println("done...");
	}

}
