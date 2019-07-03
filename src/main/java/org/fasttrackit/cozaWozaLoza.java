package org.fasttrackit;
import java.util.Scanner;

public class cozaWozaLoza {
    public static void main(String[] args) {

        System.out.println("type a number any number" );
                Scanner clw = new Scanner(System.in);
                int n,i;

                n = clw.nextInt();
                System.out.println("Printing Coza, Loza, Woza \n when numbers are divisible by 3, 5, 7\n");

                for(i=1;i<=n;i++) {
                    if(i%3 == 0) {
                        System.out.println("Coza ");
                    }
                    else if(i%5 == 0) {
                        System.out.println("Loza ");
                    }
                    else if(i%7 == 0) {
                        System.out.println("Woza ");
                    }
                    else {
                        System.out.print(i + " ");
                    }
                }
            }

        }









