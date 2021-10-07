package com.xoriant.springcoreapp.di.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanDiConstructorMain {

	public static void main(String[] args) {
		
		//Build Path -> Source -> Change to Exclude(None)
		
		//Less Functions
		//BeanFactory factory=new ClassPathXmlApplicationContext("spring_bean_di_constructor.xml");
		
		//More Functions than Bean Factory
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_bean_di_constructor.xml");

		Account account1=(Account)context.getBean("account1");
		Account account2=(Account)context.getBean("account2");
		Account account3=(Account)context.getBean("account3");
		Account account4=(Account)context.getBean("account4");
	
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		System.out.println(account4);
	}

}
