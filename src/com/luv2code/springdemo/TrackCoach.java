package com.luv2code.springdemo;

public class TrackCoach implements Coach{
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Run 5k hard daily";
	}
	
	@Override
	public String getDailyFortune() {
		return "Just do it : " + fortuneService.getFortune();
	}

}
