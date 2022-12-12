package com.masai;

import java.util.Map;

public class Demo {

private Map<Department, Employee> theMap;
	
	
	public Map<Department, Employee> getTheMap() {
		return theMap;
	}

	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}

	public void myInit() {
		System.out.println("inside myInit method");
	}

	public void cleanUp() {
		System.out.println("inside cleanUp method");
	}

	public void showDetails() {
		System.out.println("inside showDetails of Demo class");
		System.out.println(theMap);
		
	}
}
