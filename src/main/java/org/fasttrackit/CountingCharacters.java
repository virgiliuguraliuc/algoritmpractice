package org.fasttrackit;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {


//        Create a program that prompts for an input string and dis-
//        plays output that shows the input string and the number of
//        characters the string contains.
        System.out.println("Method A");
        Scanner sc = new Scanner(System.in);

        System.out.println("please type in your word and we shall calculate the number of charactes :");
        String word;
       word = sc.next();
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);
        System.out.println("-------------------");
        System.out.println("Method B");
        System.out.println("Type word");
        Scanner sc1 = new Scanner(System.in);
        String word1 = sc1.next();
        int lenght = word1.length(); // atPos0 == 'a'

        System.out.println("Lenght of word is " + lenght + " characters. ");




    }










}
