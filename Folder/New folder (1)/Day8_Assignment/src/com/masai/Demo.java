package com.masai;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sport s1=new Sport();
		
		
		
		Thread t1=new Thread(s1);
		
		Thread t2=new Thread(s1);
		
		t1.setName("Dhoni");
		t2.setName("Kohli");
		
		t1.setPriority(8);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		

	}

}
