package com.employee;

public class Employee {

	 int employeeId;
	 String employeeName;
	 double salary;
	 double netSalary;
	 
	 
	 public void calculateNetSalary(int pfPercentage) {
		 
		 netSalary=salary-pfPercentage*salary;

	 }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
