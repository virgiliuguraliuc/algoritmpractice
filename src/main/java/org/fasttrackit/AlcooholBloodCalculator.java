package org.fasttrackit;
import java.util.Scanner;

public class AlcooholBloodCalculator {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("------------------");


        //BAC = (A × 5.14 / W × r) − .015 × H
        //A is total alcohol consumed, in ounces (oz).
        //W is body weight in pounds.
        //r is the alcohol distribution ratio:
        //– 0.73 for men
        //– 0.66 for women
        //H is number of hours since the last drink.
        //Display whether or not it’s legal to drive by comparing the
        //blood alcohol content to 0.08 .

        float A, W, H;

        Scanner s=new Scanner(System.in);
        System.out.println("Hai sa vedem cat de beat esti :");
        System.out.println("How much alcohol have you counsumed in oz:  ");
        A=s.nextInt();
        System.out.println("What is your weight in pounds:  ");
        W=s.nextInt();
        System.out.println("How long ago in hours have you stoped drinking:  ");
        H=s.nextInt();

        System.out.println("Are you male or female? type 'f' for female any for male.");
        String r=s.next();

       // String gender = input.next();
        if (r.equals ("f")) {
            double R = 0.66;
            double Alcoolfemale = (A*5.14 / W *R) - (0.015 *H);
            System.out.println("Alcool in blood is" + Alcoolfemale);
        }else{
            double Rr = 0.73;
            double Alcoolmale = (A*5.14 / W *Rr) - (0.015 * H);
            System.out.println("Alcool in blood is" + Alcoolmale);



        }

      // double Alcoolfemale =(A × 5.14 / W × r) − .015 × H;

       //System.out.println("Alcool in blood is" + Alcoolfemale);



    }

}