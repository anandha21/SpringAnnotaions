package com.anandha.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//Read config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
				
		//Get the bean from container
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);

		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		System.out.println("The Email is " + theCoach.getEmail());
		System.out.println("The Team is " + theCoach.getTeam());

		//close the context
		context.close();

	}

}
