package com.masai;

public class PermanentEmployee extends Employee {

	private double basicPay;

	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicPay = basicPay;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double pfAmount = basicPay*0.12;
		double salary = basicPay-pfAmount;
		this.salary=salary;
		
	}

}
