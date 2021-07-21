package com.anandha.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")

	private FortuneService fortuneService;
	
	//Default Constructor
	public TennisCoach() {
		System.out.println("Inside Default Constructor");		
	}
	
	//Define an init method
	
    @PostConstruct
	public void doMyStratUpStuff() {
		System.out.println(">> We are using the post construct annotaion");
	}
	
    //Define an Destroy method
	@PreDestroy
	public void doMyFinalWork() {
		System.out.println(">> We are using the pre Destroy annotaion");

	}
	
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println("Inside the setter Constructor");		
		this.fortuneService=theFortuneService;
	}   */

	
   /* @Autowired
	public TennisCoach(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}  */

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your Backend Volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
