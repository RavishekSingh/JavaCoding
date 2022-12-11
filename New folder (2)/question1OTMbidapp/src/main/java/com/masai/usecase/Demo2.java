package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.entities.Collage;
import com.masai.entities.Student;
import com.masai.utility.EMUtil;

public class Demo2 {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();

		Student std = em.find(Student.class, 4);

		Collage s = std.getCol();

		System.out.println(s.getCollageId());
		System.out.println(s.getCollageName());
		System.out.println(s.getCollageAddress());

		System.out.println("=====================================");

		em.close();

	}

}
