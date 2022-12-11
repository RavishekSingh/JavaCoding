package com.student;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	public static Map<String, Student> sort(Map<String, Student> hm) {

		Set<Map.Entry<String, Student>> set = hm.entrySet();
		List<Map.Entry<String, Student>> list = new LinkedList<Map.Entry<String, Student>>(set);

		Collections.sort(list, new Comparator<Map.Entry<String, Student>>() {

			@Override
			public int compare(Entry<String, Student> p1, Entry<String, Student> p2) {

				return p1.getValue().getMarks() > p2.getValue().getMarks() ? 1 : -1;
			}

		});

		HashMap<String, Student> tp = new LinkedHashMap<String, Student>();
		for (Map.Entry<String, Student> q : list) {
			tp.put(q.getKey(), q.getValue());
		}
		return tp;
	}

	public static void main(String[] args) {

		HashMap<String, Student> hm = new HashMap<>();

		hm.put("Maharastra", new Student(10, "Ganesh", 950));
		hm.put("Tamilnadu", new Student(12, "Surya", 850));
		hm.put("Telangana", new Student(15, "Venkat", 920));
		hm.put("Haryana", new Student(16, "Dinesh", 910));
		hm.put("Kerla", new Student(18, "Srinu", 880));

		Map<String, Student> ans = sort(hm);
		// System.out.println(ans);
		Set<Map.Entry<String, Student>> set = ans.entrySet();
		for (Map.Entry<String, Student> s : set) {
			System.out.println(s);
		}

	}

}
