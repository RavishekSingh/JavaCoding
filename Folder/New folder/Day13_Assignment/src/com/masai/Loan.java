package com.masai;

public class Loan {
	
	private Loan() {
		
	}
	
	public static Loan getAObject() {
		Loan l1 = new Loan();
		return l1;
	}
	
	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
			employeeObj.calculateSalary();
			return 0.15*employeeObj.salary;
		}
		else {
			employeeObj.calculateSalary();
			return 0.10*employeeObj.salary;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
