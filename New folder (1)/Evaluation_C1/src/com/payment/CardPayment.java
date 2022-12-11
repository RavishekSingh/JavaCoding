package com.payment;

public class CardPayment implements Payment{
	private int amount;

	public CardPayment() {
		// TODO Auto-generated constructor stub
	}
	public CardPayment(int amount) {
		// TODO Auto-generated constructor stub
		this.amount=amount;
	}
	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment done using Card"+" "+amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	

}
