package com.masai;

public interface X {

	public abstract void method1();

	public default void method2() {

	}

	public static void method3() {

		System.out.println("Inside method3");

	}

}
