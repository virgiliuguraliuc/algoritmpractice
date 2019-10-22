package org.fasttrackit;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    static boolean areAnagram(char[] str1, char[] str2) {
        // ia lungimea la strings
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2)
            return false;

        // Sort strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    public static void main(String args[]) {
     String string1 ="";
     String string2 ="";
        System.out.println("Type two words to check if they are anagrams");
        Scanner scanner =new Scanner(System.in);
        string1 = scanner.next();
        string2 = scanner.next();



     char[] chars1 = string1.toCharArray();
     char[] chars2 = string2.toCharArray();


        if(areAnagram(chars1, chars2) == true){
            System.out.println(string1 +" and " + string2 + " are anagrams.");
        }else{
            System.out.println(string1 +" and " + string2 + " are not anagrams.");
        }
    }



}
