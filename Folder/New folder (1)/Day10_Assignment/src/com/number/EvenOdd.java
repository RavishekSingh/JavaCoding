package com.number;

import java.util.concurrent.Callable;

public class EvenOdd implements Callable<String>{

	int num;
	
	public EvenOdd(int num) {
		this.num=num;
	}

	@Override
	public String call() throws Exception {
	
		return num%2==0?"Even Number":"Odd Number";
		
	}
	
	

}
