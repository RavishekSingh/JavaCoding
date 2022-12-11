package com.masai2;

import java.util.TreeMap;

public class Student {

	private int roll;
	private String name;
	private int marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int marks) {

		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public static void main(String[] args) {

		TreeMap<Student, String> tm = new TreeMap<>(new StudentMarkComp());

		tm.put(new Student(10, "Ganesh", 950), "Maharastra");
		tm.put(new Student(12, "Surya", 850), "Tamilnadu");
		tm.put(new Student(15, "Venkat", 920), "Telangana");
		tm.put(new Student(16, "Dinesh", 910), "Haryana");
		tm.put(new Student(18, "Srinu", 880), "Kerla");

		System.out.println(tm);

	}

}
