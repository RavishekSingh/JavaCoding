package com.masai;

public class Department {
	private int deptId;
	private String deptName;
	private String location;
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Department(int deptId, String deptName, String location) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}


	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
	}
	
	

}