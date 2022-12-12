package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo d=ctx1.getBean("demo", Demo.class);
        d.showDetails();
		ClassPathXmlApplicationContext ctx2 = (ClassPathXmlApplicationContext) ctx1;
		ctx2.close();
	}
}
