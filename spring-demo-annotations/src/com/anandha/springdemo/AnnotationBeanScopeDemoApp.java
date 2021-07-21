package com.anandha.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		
		boolean result= (alphaCoach==theCoach);
		
		System.out.println("the reult is "+result);
		System.out.println("The memmory Location for the Coach "+theCoach );
		System.out.println("The memmory Location for Alpha Coach "+alphaCoach );

		
		context.close();
		

	}

}
