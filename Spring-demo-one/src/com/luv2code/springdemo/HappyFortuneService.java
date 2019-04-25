package com.luv2code.springdemo;
import java.util.Random;

public class HappyFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {
            "You're gonna have a bad time. ",
            "It's your lucky day! ",
            "I dunno your luck, google it... "
    };

    // create a random number generator
    private Random rand = new Random();

    @Override
    public String getFortune() {

        // pick a random string from the array
        int index = rand.nextInt(data.length);

        // read the chosen data and assign it
        String theFortune = data[index];

        // return the random data
        return theFortune;


               /* OTHER SOLUTION USING IF/ELSE IF/ELSE

                // getting a random fortune with a random generator.
                Random rand = new Random();

                // number will be 1-3
                int i = rand.nextInt(3);
                i++;

                // returns the statement, which matches the number
                if (i == 1) {
                    return "You're gonna have a bad time. ";
                } else if (i == 2) {
                    return "It's your lucky day! ";
                } else {
                    return "I dunno your luck, google it... ";
                }

                */
    }
}