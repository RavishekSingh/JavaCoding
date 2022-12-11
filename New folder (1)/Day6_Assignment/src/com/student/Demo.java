package com.student;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Demo {

	public Map<String, Student> sortMapUsingStudentName(Map<String, Student> originalMap) {
		
		 // Create a list from elements of HashMap
        List<Map.Entry<String, Student> > list= new LinkedList<Map.Entry<String, Student> >(originalMap.entrySet());
 
        // Sort the list using lambda expression
        Collections.sort(list,(i1,i2) -> i2.getValue().name.compareTo(i1.getValue().name));
 
        // put data from sorted list to hashmap
        HashMap<String, Student> temp= new LinkedHashMap<String, Student>();
        for (Map.Entry<String, Student> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Student> hm = new HashMap<>();
		hm.put("India", new Student(10, "Ram", "ram@gmail.com", 500));
		hm.put("US", new Student(20, "Taj", "raj@gmail.com", 100));
		hm.put("China", new Student(30, "Mann", "mann@gmail.com", 400));
		hm.put("Japan", new Student(40, "Viraj", "viraj@gmail.com", 200));
		hm.put("Canada", new Student(50, "Sam", "sam@gmail.com", 450));
		
		Demo d=new Demo();
		Map<String, Student> s= d.sortMapUsingStudentName(hm);
		
//		for (Map.Entry<String, Student> en :s.entrySet()) {
//           System.out.println("Key = " + en.getKey()+ ", Value = "+ en.getValue());
//       }
		
		s.forEach((key, value)->{
			 System.out.println(key +  "->" + value + " ");
		});
	}

}
