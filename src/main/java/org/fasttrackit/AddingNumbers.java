package org.fasttrackit;


import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the numbers you want added.\nEnter the number 0 to end and sum the numbers typed.");
        int sum = 0;
        while (true) {
            int number = keyboard.nextInt();
            if (number == 0) break;
            sum += number;
        }
        System.out.println("Sum is " + sum);
    }
}
