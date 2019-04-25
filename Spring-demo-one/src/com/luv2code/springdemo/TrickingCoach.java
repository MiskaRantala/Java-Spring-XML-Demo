package com.luv2code.springdemo;

public class TrickingCoach implements Coach {

    private String emailAddress;
    private String team;

    // define a private field for the dependency
    private FortuneService fortuneService;

    public TrickingCoach () {
        System.out.println("TrickingCoach: inside no-arg instructor");
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TrickingCoach: inside setteri");
        this.fortuneService = fortuneService;
    }

    // define a constructor for dependency injection
    public TrickingCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    } 

    @Override
    public String getDailyWorkout() {
        return "Do 10 backflips.";
    }

    @Override
    public String getDailyFortune() {
        return "YEET! " + fortuneService.getFortune();
    }

}
