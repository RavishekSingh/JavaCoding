package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
ApplicationContext actx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Cities c1 = actx.getBean(Cities.class);
		c1.showCities();
		
		System.out.println("==========================================");
		
		Main s1 = actx.getBean("main", Main.class);
		s1.showStudents();
		
		((AnnotationConfigApplicationContext)actx).close();
	}
}
