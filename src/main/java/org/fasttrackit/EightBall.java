package org.fasttrackit;

import java.util.Random;
import java.util.Scanner;

public class EightBall{
            public static void main ( String[] args ) {


                EightBall eightBall = new EightBall();

                eightBall.EightBallCheck();

        }
    public String UserInputStr(){
        Scanner input = new Scanner(System.in);
        String st = "";
        st = input.nextLine();
        return st;
    }
    public void EightBallCheck(){
        System.out.println("The MAGIC 8 BALL knows all, type your question stranger...");
        String question = UserInputStr();

        Random r = new Random();

        int choice = 1 + r.nextInt(15);
        String response = "";

        if (choice == 1)
            response = "It is certain";
        else if (choice == 2)
            response = "It is decidedly so";
        else if (choice == 3)
            response = "Without a doubt";
        else if (choice == 4)
            response = "Yes - definitely";
        else if (choice == 5)
            response = "You may rely on it";
        else if (choice == 6)
            response = "As I see it, yes";
        else if (choice == 7)
            response = "Most likely";
        else if (choice == 8)
            response = "Outlook good";
        else if (choice == 9)
            response = "Signs point to yes";
        else if (choice == 10)
            response = "Yes";
        else if (choice == 11)
            response = "Reply hazy, try again";
        else if (choice == 12)
            response = "Ask again later";
        else if (choice == 13)
            response = "Better not tell you now";
        else if (choice == 14)
            response = "Cannot predict now";
        else if (choice == 15)
            response = "Concentrate and ask again";
        else
            response = "8-BALL ERROR!";

        System.out.println("MAGIC 8-BALL SAYS: " + response);
    }
}