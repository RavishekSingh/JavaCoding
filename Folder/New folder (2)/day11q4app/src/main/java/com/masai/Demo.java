package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		BuildConn bc = ctx.getBean(BuildConn.class);
		
		AddStudent add = ctx.getBean(AddStudent.class);
		
		System.out.println(add.register(bc.getConn()));
		
	}
}
