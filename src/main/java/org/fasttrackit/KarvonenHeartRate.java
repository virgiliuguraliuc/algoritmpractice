package org.fasttrackit;
import java.util.*;

public class KarvonenHeartRate {



    public int UserInputB() {
        System.out.println(" Type your answer here: ");
        Scanner input = new Scanner(System.in);
        int ch = 0;
        try {
            ch = input.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Numbers only, please.");
            UserInputB();
        }
        return ch;
    }


//    }

    public void HeartBeatParameters() {
        System.out.println("What is your resting pulse?");
        int restingHR = UserInputB();
        System.out.println("What is your age?");
        int age = UserInputB();
        System.out.println(" Select Intensity (max 95%) : ");
        int Intensity = UserInputB();
        System.out.println(" Resting Pulse: " + restingHR + "    " + "Age: " + age +"\n      Intensity " + Intensity + " % ");
        System.out.println(" ");


        String format = "|%1$-15s|%2$-12s|\n";
        System.out.format(format, " Intensity ", " Rate ");
        System.out.format(format, "---------------", "------------");

        for (int A = Intensity; A <= (95); A++) {
            if (A % 5 == 0 && A > 0){

            int BPM = (((220 - age) - restingHR) * A / 100) + restingHR;
            System.out.format(format, " " + A + " %", " " + BPM + " bpm");}
        }

    }


        public static void main(String[] args) {

        KarvonenHeartRate BeatMonitor = new KarvonenHeartRate();
        BeatMonitor.HeartBeatParameters();

    }


}






