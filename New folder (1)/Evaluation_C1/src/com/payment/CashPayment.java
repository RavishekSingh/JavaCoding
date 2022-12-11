package com.payment;

public class CashPayment implements Payment{
	
	private int amount;
	public CashPayment() {
		
	}
	
	public CashPayment(int amount) {
		// TODO Auto-generated constructor stub
		this.amount=amount;
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment done using Cash"+" "+amount);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	

}
