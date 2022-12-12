package com.masai.usecase;

import javax.persistence.EntityManager;

import com.masai.entities.Course;
import com.masai.entities.Student;
import com.masai.utility.EMUtil;



public class Demo1 {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Student stud1 = new Student("Ram", "ram@gmail.com", "8763437843");
		Student stud2 = new Student("Ramesh", "ramesh@gmail.com", "8763437843");
		Student stud3 = new Student("Raj", "raj@gmail.com", "8763437843");
		Student stud4 = new Student("Raman", "raman@gmail.com", "8763437843");
		
		Course course1 = new Course(1, "JAVA", "4 Months", 200000);
		Course course2 = new Course(2, "REACT", "4 Months", 150000);
		Course course3 = new Course(3, "SPRING", "1 Months", 100000);
		Course course4 = new Course(4, "CSS", "2 Months", 100000);
		
		
		stud1.getCourses().add(course1);
		course1.getStudents().add(stud1);
		
		stud1.getCourses().add(course3);
		course3.getStudents().add(stud1);
		
		stud2.getCourses().add(course2);
		course2.getStudents().add(stud2);
		
		stud2.getCourses().add(course4);
		course4.getStudents().add(stud2);
		
		stud3.getCourses().add(course1);
		course1.getStudents().add(stud3);
		
		stud3.getCourses().add(course2);
		course2.getStudents().add(stud3);
		
		stud3.getCourses().add(course3);
		course3.getStudents().add(stud3);
		
		stud4.getCourses().add(course1);
		course1.getStudents().add(stud4);
		
		stud4.getCourses().add(course2);
		course2.getStudents().add(stud4);
		
		stud4.getCourses().add(course3);
		course3.getStudents().add(stud4);
		
		stud4.getCourses().add(course4);
		course4.getStudents().add(stud4);
		
		
		em.getTransaction().begin();
		
		em.persist(course1);
		em.persist(course2);
		em.persist(course3);
		em.persist(course4);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println();
		System.out.println("Students are added in diffrent courses...");

	}

}
