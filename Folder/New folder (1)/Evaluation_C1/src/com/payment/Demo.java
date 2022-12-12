package com.payment;

import java.util.Arrays;
import java.util.List;

public class Demo {

public static void	doTransactions(List<? extends Payment> p) {
	p.get(0).doPayment();
	p.get(1).doPayment();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<CardPayment> c1=Arrays.asList(new CardPayment(8000), new CardPayment(7000));
		List<CashPayment> c2=Arrays.asList(new CashPayment(6000), new CashPayment(9000));

		doTransactions(c1);
		doTransactions(c2);
	}

}
