package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	@Bean(name = {"std", "temp", "test"})
	public Student getStudent() {
		return new Student(getSamosa());
	}
}
