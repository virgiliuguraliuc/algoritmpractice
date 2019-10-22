package org.fasttrackit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        userInputA();
    }


    public static void userInputA() {
        System.out.println(" Please type a number so we can generate a multiplication table for it. ");
        Scanner input = new Scanner(System.in);
        int size = 0;
        try {
            size = input.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Int only, please.");
            userInputA();
        }
        int tableSize = size;
        printMultiplicationTable(tableSize);
    }

    public static void printMultiplicationTable(int tableSize) {
        // first print the top header row
        System.out.format("      ");
        for (int i = 1; i <= tableSize; i++) {
            System.out.format("%4d", i);
        }
        System.out.println();
        System.out.println("------------------------------------------");

        for (int i = 1; i <= tableSize; i++) {
            // print left most column first
            System.out.format("%4d |", i);
            for (int j = 1; j <= tableSize; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }
}



