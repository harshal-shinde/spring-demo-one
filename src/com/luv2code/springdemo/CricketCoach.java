package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	//Define private field
	private RandomFortuneService randomFortuneService;
	
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach : inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Cricket coach : inside setter method - setTeam");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "If you are all rounder do balling as well as batting drills";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket:" + randomFortuneService.getFortune();
	}

	public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
		System.out.println("Cricket coach : inside setter method - setFortuneService");
		this.randomFortuneService = randomFortuneService;
	}

}
