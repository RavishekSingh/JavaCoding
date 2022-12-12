package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entities.ContractualEmployee;
import com.masai.entities.SalariedEmployee;
import com.masai.utility.EMUtil;

public class Demo2 {

	public static void main(String[] args) {

EntityManager em=EMUtil.provideEntityManager();
		
		Query q=em.createQuery("from ContractualEmployee ");
		
		List<ContractualEmployee> list=q.getResultList();
		list.forEach(s->{
			System.out.println(s.getEmpId());
			System.out.println(s.getEmpName());
			System.out.println(s.getNoOfWorkingDays());
			System.out.println(s.getCostofperday());
			System.out.println(s.getMobileNumber());
			System.out.println("=================================");
		});

	}

}
