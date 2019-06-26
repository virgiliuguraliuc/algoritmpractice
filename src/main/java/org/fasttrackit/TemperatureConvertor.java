package org.fasttrackit;
import java.util.Scanner;

public class TemperatureConvertor {
//a.


    public double tempCtoF (double c) {
        double f = c * 1.8 + 32;
        System.out.println(" temperature is in celsius now @ " + c + " degrees and in fahrenheit its " + f +  "degrees");
        return f;


    }
     public double tempFtoC (double fahrenheit){
         double c =(fahrenheit-32)*5/9;
         System.out.println(" temperature is in fahrenheit now @ " + fahrenheit + " degrees and in celsisus is @ " + c + "degrees");
         return c;





        }


//b. creati o siungura metoda care sa primesa temperatura (numeric) si tipul de temperatura dort (string) si sa realizeze conversia necesera, apelati in main pt fiecare caz










    public static void main(String[] args) {

TemperatureConvertor temperatureConvertor = new TemperatureConvertor();

temperatureConvertor.tempCtoF(12);

temperatureConvertor.tempFtoC(45);

        System.out.println("------------------");

        float cel, far, gel;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter temp. in Celsius :");
        cel=s.nextInt();

        far = cel * 9/5 + 32;

        System.out.println("Temp. in Fahrenheit: "+far);

        System.out.println("Enter temp. in Fahrenheit : " );
        far=s.nextInt();
        gel = (far - 30)*5/9;
        System.out.println("Temp. in Fahrenheit: "+gel);

    }

//    double f,c;
//    Scanner sc=new Scanner(System.in);
//	    System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
//    int ch=sc.nextInt();
//	    switch(ch)
//    {
//        case 1:  System.out.println("Enter  Fahrenheit temperature");
//            f=sc.nextDouble();
//            c=(f-32)*5/9;
//            System.out.println("Celsius temperature is = "+c);
//            break;
//        case 2:  System.out.println("Enter  Celsius temperature");
//            c=sc.nextDouble();
//            f=((9*c)/5)+32;
//            System.out.println("Fahrenheit temperature is = "+f);
//            break;
//        default:  System.out.println("please choose valid choice");
    }












