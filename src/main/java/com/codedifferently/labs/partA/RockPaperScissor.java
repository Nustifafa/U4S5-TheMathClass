package com.codedifferently.labs.partA;

import java.util.Random;

public class RockPaperScissor {


    public static void main(String[] args) {
        //create an instance of the Random class
        Random random  = new Random();

        //Generate a random number between 0 and 2 (inclusive)
        int randomNumber = random.nextInt(3); //3 is exclusive

        System.out.println("Random number: " + randomNumber);

    }
}
