package com.masai;

public interface Y {

	public abstract void method4();

	public default void method5() {
      
		System.out.println("Inside method5");
	}

	public static void method6() {

		System.out.println("Inside method6");

	}

}
