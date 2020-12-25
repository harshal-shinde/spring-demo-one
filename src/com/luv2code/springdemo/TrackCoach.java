package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	//Define private field
	private FortuneService fortuneService;

	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//Init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : inside Method doMyStartupStuff");
	}
	
	//Destroy Method
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach : inside Method doMyDestroyStuff");
	}

}
