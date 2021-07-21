package com.anandha.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is Sad Fortune";
	}

}
