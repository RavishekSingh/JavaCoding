package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.utility.EMUtil;

public class GetPrdPriceByPId {

	public static void main(String[] args) {

		EntityManager em=EMUtil.provideEntityManager();
		
		Query q=em.createNamedQuery("product.price");
		q.setParameter("id", 1);
		
	List<Object[]> ans=(List<Object[]>) q.getResultList();
			
	for(Object[] s:ans)
	{
		System.out.println();
		System.out.println(s[1]);
	
		
		System.out.println("===============");
	}
	
			em.close();
			
			System.out.println("done...");
		}
	}


