package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

		// ApplicationContext ctx= new
		// ClassPathXmlApplicationContext("applicationContext.xml");

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Travel obj = ctx.getBean(Travel.class);

		obj.journey();

		((AnnotationConfigApplicationContext) ctx).close();
	}

}
