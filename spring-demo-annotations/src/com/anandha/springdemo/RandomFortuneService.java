package com.anandha.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Set an array of strings
	private String[] data={"you are a good boy",
			"you can do it anandha!",
			"Today you are  gonna achive it",
			"Try Try until we succeeded"};
	
	//Create random no generator
	private Random myRandom=new Random();
			
	@Override
	public String getFortune() {
		
		//pick random strings from array
		
		int index=myRandom.nextInt(data.length);
		
		String theFortune=data[index];
		
		return theFortune;
	}

}
