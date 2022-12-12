package com.question3;

import java.util.concurrent.Callable;

public class Product implements Callable<Integer> {

	int num;
	public Product(int num) {
		this.num=num;
	}

	@Override
	public Integer call() throws Exception {
		int p=1;
		for(int i=1;i<=num;i++) {
			p=p*i;
		}
		return p;
	}

}
