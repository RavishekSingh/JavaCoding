package com.masai;

public class Main {

	public static Person generatePerson(Person person) {
		
		if(person instanceof Student) {
		   
			Student s1 = (Student)person;
			
			return s1;
		}
		else {
			Instructor i1 = (Instructor)person;
			return i1;
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person newStudent = generatePerson(new Student(10,"FSD",30000,"Ranchi","Jharkhand","831005"));
		System.out.println(newStudent);
		

		Person newTeacher = generatePerson(new Instructor(145,25000,"Bokaro","Jharkhand","831004"));
		System.out.println(newTeacher);

		

	}

}
