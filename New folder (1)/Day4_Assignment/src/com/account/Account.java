package com.account;

public class Account {

	public String accountNumber;
	public double balance;

	public Account(String accountNumber, double balance) {
		// TODO Auto-generated constructor stub
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Amount Credited now balance is"+" "+balance);

	}

	public double withdraw(double amount) throws InsufficientFundException {
		if (amount > balance) {
			InsufficientFundException ie = new InsufficientFundException("Insufficient balance");
			throw ie;
		} else {
			balance = balance - amount;
			return balance;
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
