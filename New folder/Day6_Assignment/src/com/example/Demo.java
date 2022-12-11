package com.example;

public class Demo {

	Demo(){
		this("Ram");
		System.out.println("Inside Demo()");
	}
	
	Demo(String s){
		this(5);
		System.out.println("Inside Demo(String s)");
	}
	
	Demo(int i){
		this(5.5f);
		System.out.println("Inside Demo(int i)");
	}
	
	Demo(float f){
		
		System.out.println("Inside Demo(float f)");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d1 = new Demo();

	}

}
