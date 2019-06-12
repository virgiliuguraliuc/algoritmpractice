package org.fasttrackit;


/**
 * Hello world!
 *
 */
public class App {


        public double displayAverage(double no1, double no2, double no3) {
        System.out.println("display average of: " + no1 + no2 + no3);
            double average = (no1 + no2 + no3) / 3;


            System.out.println(" average is: " + average);
return average;

        }

        public static void main ( String[] args )
        {
            App App = new App();
            App.displayAverage(1, 4, 7);        }

    }
