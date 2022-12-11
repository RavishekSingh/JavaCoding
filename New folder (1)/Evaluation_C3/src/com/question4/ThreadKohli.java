package com.question4;

public class ThreadKohli extends Thread {

	ThreadRohit tr;
	public ThreadKohli(ThreadRohit tr) {
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
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}

}
