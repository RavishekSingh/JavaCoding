package com.product;

public class MyThread extends Thread {

	int p=1;
	@Override
	public void run() {
		
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				p=p*i;
			}
			this.notify();
		}
		
	}

}
