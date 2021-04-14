package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiTest {

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person per = (Person)context.getBean("person1");
		
		System.out.println(per);
		
		Addition add = (Addition)context.getBean("add1");
		add.doSum();
		System.out.println(add);
	}
}
