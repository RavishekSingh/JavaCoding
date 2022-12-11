package com.question2;

public class Main {

	public static void main(String[] args) {
		
		MyThread m1= new MyThread();
		m1.start();
		
		synchronized (m1) {
		
			try {
				m1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(m1.p);

	}

}
