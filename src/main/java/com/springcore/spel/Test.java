package com.springcore.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.springcore.App;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo d1 = context.getBean("demo", Demo.class);
		
		System.out.println("d1="+d1);
		
		/*
		 * SpelExpressionParser parser = new SpelExpressionParser(); Expression expn =
		 * (Expression) parser.parseExpression("12+12");
		 * System.out.println(expn.getValue());
		 */
		
	}
}
