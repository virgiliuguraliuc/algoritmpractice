package org.fasttrackit;

import java.util.Scanner;

public class NumberToMonth {
    public static void main(String[] args) {
        String[] monthName = {"January", "February",
                "March", "April", "May", "June", "July",
                "August", "September", "October", "November",
                "December"};
        System.out.println("type a number and the equivalent month name will be displayed: ");
        Scanner scan = new Scanner(System.in);
        int monthNumber = scan.nextInt();

        String month = monthName[monthNumber-1];

        System.out.println("Month name: " + month);
    }
}

