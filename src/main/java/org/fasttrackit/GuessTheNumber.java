package org.fasttrackit;

import java.util.Random;
import java.util.Scanner;
import java.lang.System;

public class GuessTheNumber {

    public static void main(String[] args) {


        System.out.println("Lets play a game, your goal is to guess the number .");
        System.out.println("Pick the maximum number: ");

        Scanner inputnum = new Scanner(System.in);
        int maxNumber;
        maxNumber = inputnum.nextInt();

        Random rand = new Random();
        int number = rand.nextInt(maxNumber);
        int tries = 0; //Will increase depending on how many tires it takes
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false) { //code will repeat until win == true

            System.out.println("Guess a number between 0 and " + maxNumber + ": ");
            guess = input.nextInt();
            tries++; //Increasing the number set in the variable tries by 1

            if (guess == number) {
                win = true; //Since the number is correct win == true then ending the loop
                //First thing the guess is compared too
            } else if (guess < number) {
                System.out.println("Number is to low, tray again");
                //2nd thing guess is compared too.
            } else if (guess > number) {
                System.out.println("Number is to high, try again");
                //3rd thing guess is compared too.
            }

        }

        System.out.println("You win!");
        System.out.println("It took you " + tries + " tries.");

    }
    }
