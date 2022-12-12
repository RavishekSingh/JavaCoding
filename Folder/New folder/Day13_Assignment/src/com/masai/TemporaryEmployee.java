package com.masai;

public class TemporaryEmployee extends Employee {

	private int hoursWorked;
	private int hourlyWages;

	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double salary =hoursWorked*hourlyWages;
		this.salary=salary;
		
	}

}
