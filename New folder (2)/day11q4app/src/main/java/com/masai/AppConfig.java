package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("db.properties")
public class AppConfig {
	
	@Bean("s1")
	public Student getStudent() {
		return new Student(1, "Ram", 500);
	}
}
