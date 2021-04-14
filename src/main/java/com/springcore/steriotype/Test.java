package com.springcore.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/steriotype/sterioconfig.xml");
		Student std = context.getBean("student", Student.class);
		
		System.out.println(std);
		System.out.println(std.getAddress().getClass().getName());
		
		System.out.println(std.hashCode());
		
		Student std2 = context.getBean("student", Student.class);
		System.out.println(std2.hashCode());
		
		Teacher teacher1=context.getBean("teacher", Teacher.class);
		System.out.println("teacher1="+teacher1.hashCode());
		
		Teacher teacher2=context.getBean("teacher", Teacher.class);
		System.out.println("teacher2="+teacher2.hashCode());
	} 

}
