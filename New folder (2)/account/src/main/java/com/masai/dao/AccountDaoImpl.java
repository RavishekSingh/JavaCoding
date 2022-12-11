package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.masai.entities.Account;

public class AccountDaoImpl implements AccountDao{

	@Override
	public Account findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Account account) {
	
		String message="";
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		em.persist(account);
		
		et.commit();
		em.close();
		
		if(account!=null)
			message="Account Created";
		else
			message="No record created";
		
		return message;
	}

	@Override
	public String deleteAccountById(int id) {
		String message="";

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		Account account=em.find(Account.class, id);
		
		if(account!=null) {
			et.begin();
			
			em.remove(account);
			
			et.commit();
			message="Account Deleted";
		
		}
		
		else {
			message="No id found";
		}
		
		em.close();
		
		return message;
			
	}

	@Override
	public String withdraw(double amount, int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deposit(double amount, int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
