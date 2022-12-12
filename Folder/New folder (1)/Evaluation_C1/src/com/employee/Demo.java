package com.employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;

public class Demo {

	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee, String> originalMap) {

		Set<Map.Entry<Employee, String>> set = originalMap.entrySet();
		List<Map.Entry<Employee, String>> list = new LinkedList<Map.Entry<Employee, String>>(set);
		Collections.sort(list, new Comparator<Map.Entry<Employee, String>>() {

			@Override
			public int compare(Entry<Employee, String> o1, Entry<Employee, String> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().getSalary() > o2.getKey().getSalary() ? 1 : -1;
			}

		});

		HashMap<Employee, String> tp = new LinkedHashMap<Employee, String>();
		for (Map.Entry<Employee, String> q : list) {
			tp.put(q.getKey(), q.getValue());
		}
		return tp;
	}

	public static void main(String[] args) {

		HashMap<Employee, String> hm = new HashMap<>();

		hm.put(new Employee(10, "Raj", 5000), "Pune");
		hm.put(new Employee(20, "Ram", 5050), "Pune");
		hm.put(new Employee(30, "Mohan", 6000), "Pune");
		hm.put(new Employee(40, "Amar", 4000), "Pune");
		hm.put(new Employee(50, "Viraj", 1000), "Pune");

		Demo d1 = new Demo();

		Map<Employee, String> ans = d1.sortMapUsingEmployeeSalary(hm);

		Set<Map.Entry<Employee, String>> set = ans.entrySet();
		for (Map.Entry<Employee, String> q : set) {
			System.out.println(q);
		}
	}

}
