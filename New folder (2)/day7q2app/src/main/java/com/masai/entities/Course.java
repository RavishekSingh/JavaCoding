package com.masai.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	private int courseId;
	private String courseName;
	private String duration;
	private int fee;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Studs_Course", joinColumns = @JoinColumn(name = "courseId"), inverseJoinColumns = @JoinColumn(name = "rollNo"))
	private List<Student> students = new ArrayList<>();
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	public Course(int courseId, String courseName, String duration, int fee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setCourses(List<Student> students) {
		this.students = students;
	}
	
	

}