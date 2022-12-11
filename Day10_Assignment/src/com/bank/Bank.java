package com.bank;

public class Bank {
	
	 private Bank(){
	      System.out. println("Inside private constructor of Bank");
	   }
	 
	 public static Bank getBank() {
		 Bank b1 = new Bank();
		 return b1;
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
