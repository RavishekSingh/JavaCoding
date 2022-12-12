package com.question4;

public class Main {

	public static void main(String[] args) {
		
		ThreadDhoni t1=new ThreadDhoni();
		ThreadRohit t2= new ThreadRohit(t1);
		ThreadKohli t3= new ThreadKohli(t2);
		
		t1.setName("Dhoni");
		t2.setName("Rohit");
		t3.setName("Kohli");
		
		t1.setPriority(10);
		t2.setPriority(5);
		t3.setPriority(1);
	
		t1.start();
		t2.start();
		t3.start();
		

	}

}
