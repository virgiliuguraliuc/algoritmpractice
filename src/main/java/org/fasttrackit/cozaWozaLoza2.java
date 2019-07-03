package org.fasttrackit;

public class cozaWozaLoza2 {

    private void printNumbersLine(int startingNumber) {
        for (int i = 1; i <= 11; i++) {
            int number = startingNumber + i;
            String text = number + i + "";

            if (number % 3 == 0 && number % 5 == 0) {
                text = "CozaLoza";
            } else if (number % 3 == 0) {
                text = "coza";
            } else if (number % 5 == 0) {
                text = "Woza";
            } else if (number % 7 == 0) {
                text = "Loza";
            }

            else{
                    System.out.print(i + " ");

                }


                System.out.println(text + " ");
            }
            System.out.println(" ");

        }

        public void printAllNumbers () {
            for (int i = 0; i < 100; i += 11) {
                printNumbersLine(i);
//            if(i%3 == 0) {
//                System.out.println("Coza ");
//            }
//            else if(i%5 == 0) {
//                System.out.println("Loza ");
//            }
//            else if(i%7 == 0) {
//                System.out.println("Woza ");
//            }
//            else {
//                System.out.print(i + " ");

            }
        }


        public static void main (String[]args){

            cozaWozaLoza2 exercise = new cozaWozaLoza2();
            //exercise.printNumbersLine(0);
            exercise.printAllNumbers();

        }
    }

