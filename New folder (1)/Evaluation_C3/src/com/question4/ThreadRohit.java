package com.question4;

public class ThreadRohit extends Thread {

	ThreadDhoni tr;
	public ThreadRohit(ThreadDhoni tr) {
		this.tr=tr;
	}
	@Override
	public void run() {
	
		try {
			tr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int p=1;
		for(int i=1;i<=10;i++) {
			p=p*i;
		}
		System.out.println(p);
	}

	

}
