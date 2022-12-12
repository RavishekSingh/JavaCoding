package com.masai;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private Map<Student, Course> theMap;

	@Autowired
	private List<Student> theStudents;

	@Value("${appName}")
	private String appName;

	public void printMap() {

		Iterator<Map.Entry<Student, Course>> itr=theMap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Student, Course> et=itr.next();
			System.out.println(et.getKey()+" "+et.getValue());
		}
	}

	public void printList() {

		theStudents.sort(new Comparator<Student>() {
			public int compare(Student o1,Student o2) {
				return o1.getMarks()-o2.getMarks();
			}
		});
		
		theStudents.forEach(s->System.out.println(s));
	}

	public void printAppName() {

		System.out.println(appName);
	}
}
