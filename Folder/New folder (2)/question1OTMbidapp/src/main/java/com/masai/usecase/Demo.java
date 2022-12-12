package com.masai.usecase;

import javax.persistence.EntityManager;

import com.masai.entities.Collage;
import com.masai.entities.Student;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
	
		EntityManager em=EMUtil.provideEntityManager();
		
		Collage col1=new Collage();
		col1.setCollageName("IIT Mumbai");
		col1.setCollageAddress("Mumbai");
		
		Student std1=new Student();
		std1.setStudentName("Ram");
		std1.setMobileNumber(12345);
		std1.setEmail("ram@gmail.com");
		std1.setCol(col1);

		Student std2=new Student();
		std2.setStudentName("Sam");
		std2.setMobileNumber(42345);
		std2.setEmail("sam@gmail.com");
		std2.setCol(col1);
		
		Student std3=new Student();
		std3.setStudentName("Shyam");
		std3.setMobileNumber(12445);
		std3.setEmail("shyam@gmail.com");
		std3.setCol(col1);
		
		Student std4=new Student();
		std4.setStudentName("Mohan");
		std4.setMobileNumber(12346);
		std4.setEmail("mohan@gmail.com");
		std4.setCol(col1);
		
		col1.getStd().add(std1);
		col1.getStd().add(std2);
		col1.getStd().add(std3);
		col1.getStd().add(std4);
		
		em.getTransaction().begin();
		
		em.persist(col1);
		
		em.getTransaction().commit();
		
		System.out.println("done");
		
		em.close();
		
	}

}
