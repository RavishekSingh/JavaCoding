package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entities.Collage;
import com.masai.entities.Student;
import com.masai.utility.EMUtil;

public class Demo1 {

	public static void main(String[] args) {
	
		EntityManager em=EMUtil.provideEntityManager();
		
		Collage col=em.find(Collage.class,1);
		
		List<Student> std=col.getStd();
		
		std.forEach(s->{
			
			System.out.println(s.getStudentRoll());
			System.out.println(s.getStudentName());
			System.out.println(s.getMobileNumber());
			System.out.println(s.getEmail());
			System.out.println("=====================================");
		});
		


		
		em.close();
		
	}

}
