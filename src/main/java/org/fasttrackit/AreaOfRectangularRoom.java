package org.fasttrackit;


import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfRectangularRoom {


    //iau user input si il verific ca scrie bine int
    public double UserInput() {
        System.out.println(" Enter your number:");
        Scanner input = new Scanner(System.in);
        double a = 0;
        try {
            a = input.nextDouble();

        } catch (InputMismatchException e) {

            System.out.println("Double only, please.");
            UserInput();
        }
        return a;

    }

    public int UserInputA() {
        System.out.println(" Select Option: ");
        Scanner input = new Scanner(System.in);
        int ch = 0;
        try {
            ch = input.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Int only, please.");
            UserInputA();
        }
        return ch;

    }

    public double areaToSquareMeteres(double areaInFeet) {
        double areaInMeters = areaInFeet * 0.09290304;

        return areaInMeters;
    }

    public double areaToSquareFeet(double areaInMeters) {
        double areaInFeet = areaInMeters * 10.7639;

        return areaInFeet;
    }


    public double dimensionToMeters(double feet) {
        double meters = feet * 0.3048;

        return meters;
    }

    public double dimensionToFeet(double meters) {
        double feet = meters * 3.28084;
        return feet;
    }

    public double CalculateArea(double W, double L) {
        double pureArea = W * L;
        return pureArea;
    }

    public int Calcuate() {
        int user = UserInputA();
        switch (user) {
            case 1:
                System.out.println(" you selected Metric ");
                System.out.println(" -------------- ");
                System.out.println(" Input Lenght in meters : ");
                double L = UserInput();
                System.out.println(" Lenght = " + L + " meters \n Input Width in meters :");
                double W = UserInput();
                System.out.println(" Width = " + W + " meters");
                System.out.println(" Area of room is: " + CalculateArea(W, L) + " square meters");

                System.out.println("----------------------------------------------------------");
                double area = CalculateArea(W,L);
                System.out.println(" In feet the dimensions are \n Width in feet: " + dimensionToFeet(W)
                + "feet.\n Lenght in feet: " + dimensionToFeet(L) + " feet.\n Area in Imperial is " + areaToSquareFeet(area) + " square feet. ");


                break;
            case 2:

                System.out.println(" you selected Imperial");
                System.out.println(" -------------- ");
                System.out.println(" Input Lenght in feet : ");
                double LE = UserInput();
                System.out.println(" Lenght = " + LE + " meters \n Input Width in feet :");
                double WI = UserInput();
                System.out.println(" Width = " + WI + " feet");
                System.out.println("Area of room is: " + CalculateArea(WI, LE) + " square feet");

                System.out.println("----------------------------------------------------------");
                double area2 = CalculateArea(WI,LE);
                            System.out.println(" in meters the dimensions are \n Width in meters: " + dimensionToMeters(WI)
                        + "feet.\n Lenght in meters: " + dimensionToMeters(LE) + " feet.\n Area in metric is " + areaToSquareMeteres(area2) + " square meters. ");
                break;
            default:

                System.out.println(" chose 1 or 2 ");
                Calcuate();
        }
    return user;
    }



    public static void main(String[] args) {

        AreaOfRectangularRoom AreaCalc = new AreaOfRectangularRoom();

        System.out.println(" Select measurement system  \n  1. for Metric \n  2. for Imperial ");
        AreaCalc.Calcuate();



    }
}