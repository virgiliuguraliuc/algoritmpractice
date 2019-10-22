package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SelectWinner {
    public static void main(String[] args) {
        System.out.println("Random winner generator");
        List<String> list = new ArrayList<>();
        int size = userInputA();


        System.out.println("Please add the names of your friends, the winner will be randomly generated.\n Type their name and hit enter after each one.");
        for (int i = 0; i < size; i++ ) {
            Scanner input = new Scanner(System.in);
            String name = "";
            name = input.nextLine();
            list.add(name);
        }
        getRandomName(list);
    }
    public static int userInputA() {
        System.out.println(" \"How many friends do you have?\" ");
        Scanner numberOfFriends = new Scanner(System.in);
        int size = 0;
        try {
            size = numberOfFriends.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Int only, please.");
            userInputA();
        }
       return size;
    }

private static void getRandomName(List<String> list) {
        int index = ThreadLocalRandom.current().nextInt(list.size());
        int number = index + 1;
    System.out.println("winner is number : " + number + " " + list.get(index)+ "!");
}
}


