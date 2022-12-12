package com.masai.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
private int	deptId;
private String	deptName;
private String	location;

@OneToMany(cascade = CascadeType.ALL,mappedBy = "dep")
private List<Employee> emp=new ArrayList<>();

public Department() {
	// TODO Auto-generated constructor stub
}

public Department(int deptId, String deptName, String location, List<Employee> emp) {
	super();
	this.deptId = deptId;
	this.deptName = deptName;
	this.location = location;
	this.emp = emp;
}

public int getDeptId() {
	return deptId;
}

public void setDeptId(int deptId) {
	this.deptId = deptId;
}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public List<Employee> getEmp() {
	return emp;
}

public void setEmp(List<Employee> emp) {
	this.emp = emp;
}

@Override
public String toString() {
	return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + ", emp=" + emp + "]";
}



}
