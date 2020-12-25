package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		//call methods on bean
		System.out.println(coach.getDailyWorkout());
		
		//call methods on bean
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
