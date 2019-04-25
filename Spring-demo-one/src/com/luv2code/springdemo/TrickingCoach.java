package com.luv2code.springdemo;

public class TrickingCoach implements Coach {

    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    // add email getter
    public String getEmailAddress() {
        return emailAddress;
    }

    // add email setter
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // add team getter
    public String getTeam() {
        return team;
    }

    // add team setter
    public void setTeam(String team) {
        this.team = team;
    }

    // define a private field for the dependency
    private FortuneService fortuneService;

    public TrickingCoach () {
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    // define a constructor for dependency injection
    public TrickingCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    // provide the info class wants to
    @Override
    public String getDailyWorkout() {
        return "Do 10 backflips.";
    }

    // provide the info class wants to
    @Override
    public String getDailyFortune() {
        return "YEET! " + fortuneService.getFortune();
    }

}
