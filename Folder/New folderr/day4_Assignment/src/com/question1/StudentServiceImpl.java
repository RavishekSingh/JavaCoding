package com.question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class StudentServiceImpl implements StudentService{

	 List<Student> list=new ArrayList<>();
	 
	 
		@Override
		public Student addStudent(Student st) {
			list.add(st);
			return st;
		}

		@Override
		public void deleteStudent(int id) {
			// TODO Auto-generated method stub
			for(Student st:list) {
				if(st.getId() == id) {
					list.remove(st);
				}
			}
		}

		@Override
		public Student findStudent(int id) {
			Student student =null;
			for(Student st:list) {
				if(st.getId() == id) {
					student=st;
				}
			}
			return student;
		}



		@Override
		public HashSet<Student> setOfMarks() {
			HashSet<Student> hs=new HashSet<>();
			
			for(Student st:list) {
				hs.add(st);
			}
			return hs;
		}

		@Override
		public List<Student> sortWithName() {
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		return list;
		}

		@Override
		public void addAllStudents(List<Student> st) {
			
			boolean added = list.addAll(st);
			Collections.sort(list,new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					return o1.getMarks()>o2.getMarks() ? +1: -1;
				}

				
			});
		}

		@Override
		public List<Student> findStudentWithPincode(int pincode) {
			List<Student> students =null;
			
			for(Student st:list) {
				if(st.getAddress().getPincode() == pincode) {
					students.add(st);
				}
			}
			return students;
		}

}
