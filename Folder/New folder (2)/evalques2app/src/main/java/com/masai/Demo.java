package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {

		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		StudentService st=ctx.getBean(StudentService.class);
		st.printMap();
		System.out.println("======================================");
		st.printList();
		System.out.println("======================================");
		st.printAppName();
	}

}
