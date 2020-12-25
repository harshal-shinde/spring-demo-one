package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	
	String[] fortunes = new String[] {
			"You are lucky chram",
			"You will take stunning catch",
			"You will score 100"
	};
	
	@Override
	public String getFortune() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(3);
		return fortunes[randomNumber];
	}

}
