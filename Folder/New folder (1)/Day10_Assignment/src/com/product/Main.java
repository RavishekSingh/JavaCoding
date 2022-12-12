package com.product;

public class Main {

	public static void main(String[] args) {
		
		MyThread m1 =new MyThread();
		
		m1.start();
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		  try {
//			m1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
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
