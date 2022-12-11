package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entities.Product;
import com.masai.utility.EMUtil;

public class GetPrdNameQty {

	public static void main(String[] args) {

EntityManager em=EMUtil.provideEntityManager();
		
	Query q=em.createNamedQuery("product.nameAndQty");
	
	List<Object[]> list=q.getResultList();
		
	for(Object[] s:list)
	{
		System.out.println();
		System.out.println(s[0]);
		System.out.println(s[1]);
		
		System.out.println("===============");
	}
		em.close();
		
		System.out.println("done...");
	}

}
