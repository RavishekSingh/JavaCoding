package com.account;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac=new Account("ABC12345",500);
		ac.deposit(1000);
		try {
			double amt=ac.withdraw(500);
			System.out.println(amt);
		}
		catch(InsufficientFundException ie){
			
			
			System.out.println(ie.getMessage());
		}
		try {
			double amt=ac.withdraw(1100);
			System.out.println(amt);
		}
		catch(InsufficientFundException ie){
			
			System.out.println(ie.getMessage());
		}

		System.out.println("Thanks");
	}

}
