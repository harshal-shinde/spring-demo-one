package com.luv2code.springdemo;

public class BaseBallCoach implements Coach {

	//Define private field
	private FortuneService fortuneService;
	
	
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
