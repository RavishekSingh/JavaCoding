package com.masai2;

import java.util.Comparator;

public class StudentMarkComp implements Comparator<Student> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getMarks()>o2.getMarks()?1:-1;
	}
	
	

}
