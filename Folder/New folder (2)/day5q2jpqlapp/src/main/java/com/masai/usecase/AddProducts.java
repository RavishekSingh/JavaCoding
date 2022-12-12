package com.masai.usecase;

import javax.persistence.EntityManager;

import com.masai.entities.Product;
import com.masai.utility.EMUtil;

public class AddProducts {

	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();
		
		Product product=new Product();
		
		product.setProductName("Mouse");
		product.setPrice(500);
		product.setQuantity(2);
		em.getTransaction().begin();
		
		em.persist(product);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("done...");

	}

}
