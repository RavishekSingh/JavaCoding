package com.question1;

import java.util.HashSet;
import java.util.List;

public interface StudentService {

	public Student addStudent(Student st);

	public void deleteStudent(int id);

	public Student findStudent(int id);

	public List<Student> findStudentWithPincode(int pincode);

	public HashSet<Student> setOfMarks();

	public List<Student> sortWithName();

	public void addAllStudents(List<Student> s);
}
