package org.fasttrackit;


/**
 * Hello world!
 *
 */
public class App {


        public double displayAverage(int no1, int no2, int no3) {
        System.out.println("Display Average of: " +", "+ no1 + ", " + no2 +", "+ no3);
            double average = (no1 + no2 + no3) / 3;


            System.out.println(" Average is: " + average);
return average;

        }

        public static void main ( String[] args )
        {
            App App = new App();
            App.displayAverage(1, 4, 7);        }

    }
