package com.masai;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X x1 = new ZImpl();
		x1.method1();
		x1.method2();
		X.method3();

		Y y1 = new ZImpl();
		y1.method4();
		y1.method5();
		Y.method6();

		Z z1 = new ZImpl();
		z1.method7();

	}

}
