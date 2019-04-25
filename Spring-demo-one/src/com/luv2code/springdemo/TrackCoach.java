package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    public TrackCoach () {

    }

    // define a constructor for dependency injection
    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    // provide the info class wants to
    @Override
    public String getDailyWorkout() {
        return "Run a hard 10k";
    }

    // provide the info class wants to
    @Override
    public String getDailyFortune() {

        return "Lol no. " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println(("TrackCoach: inside method Startup Stuff"));
    }

    // add a destroy method
    public void doMyCleanupStuff() {
        System.out.println(("TrackCoach: inside method Cleanup Stuff"));
    }



}
