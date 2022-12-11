package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.utility.EMUtil;

public class Demo3 {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Query q = em.createNativeQuery("select c.courseId, c.courseName, c.duration, c.fee from Student s inner join Course c inner "
				+ "join studs_course sc on s.roll=sc.rollNo and c.courseId=sc.courseId and s.roll=:roll");
		
		q.setParameter("roll", 2);
		
		List<Object[]> list = q.getResultList();
		
		for(Object[] s:list)
		{
			System.out.println();
			System.out.println(s[0]);
			System.out.println(s[1]);
			System.out.println(s[2]);
			System.out.println(s[3]);
			System.out.println("===============");
		}
	}

}
