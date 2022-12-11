package com.masai.main;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;

public class DeleteAccount {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Delee Account");
		
		System.out.println("Enter account id");
		int id=sc.nextInt();
		
		AccountDao account=new AccountDaoImpl();
		
		String result=account.deleteAccountById(id);
		System.out.println(result);
	}

}
