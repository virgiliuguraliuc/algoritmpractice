package org.fasttrackit;

public class count {
    public static void main(String[] args) {


        for(int number = 0; number <= 110; number++) {
            if(number % 11 == 0 && number > 0)
                System.out.println(number);
            else
                System.out.print(number + " ");
        }



    }

}
