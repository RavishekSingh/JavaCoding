package com.masai;

public class Sport implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++) {
			
			String name=Thread.currentThread().getName();
			int pr=Thread.currentThread().getPriority();
			System.out.println(pr+" "+name);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
