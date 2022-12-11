package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DShapes ds=ctx.getBean("dShapes",DShapes.class);
		ds.draw(new Triangle());
	}

}
