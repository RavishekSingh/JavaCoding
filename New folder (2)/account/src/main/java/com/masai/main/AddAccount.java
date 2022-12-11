package com.masai.main;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class AddAccount {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);  
       System.out.println("Add Account");
       
       System.out.println("Enter account id");
       int id=sc.nextInt();
       
       System.out.println("Enter email");
       String email=sc.next();
       
       System.out.println("Enter address");
       String address=sc.next();
       
       System.out.println("Enter balance");
       double balance=sc.nextDouble();
       
       
       AccountDao account=new AccountDaoImpl();
       
      String result= account.save(new Account(id,email,address,balance));
       System.out.println(result);
       
	}

}
