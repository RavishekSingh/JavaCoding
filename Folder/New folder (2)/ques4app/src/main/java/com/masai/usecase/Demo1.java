package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entities.SalariedEmployee;
import com.masai.utility.EMUtil;

public class Demo1 {

	public static void main(String[] args) {

		EntityManager em=EMUtil.provideEntityManager();
		
		Query q=em.createQuery("from SalariedEmployee ");
		
		List<SalariedEmployee> list=q.getResultList();
		list.forEach(s->{
			System.out.println(s.getEmpId());
			System.out.println(s.getEmpName());
			System.out.println(s.getSalary());
			System.out.println(s.getEmail());
			System.out.println("=================================");
		});
	}

}
