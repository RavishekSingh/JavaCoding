package com.masai.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {

	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int	empId;
private String	empName;

public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(String empName) {
	super();

	this.empName = empName;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + "]";
}







}
