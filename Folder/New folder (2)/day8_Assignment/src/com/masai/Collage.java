package com.masai;

public class Collage {

	private Person p;
	
	
	public Collage(Person p) {
		super();
		this.p = p;
	}


//	public void setP(Person p) {
//		this.p = p;
//	}


	public void doJob(){
		
		p.work();
		
		System.out.println("Job is started");

	}
}
