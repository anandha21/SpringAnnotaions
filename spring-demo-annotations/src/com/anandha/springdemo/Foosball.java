package com.anandha.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Foosball implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Try a hard luck here";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
