package org.fasttrackit;

import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;

public class RandomPasswordGenerator {
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String OTHER_CHAR = "!@#$%&*()_+-=[]?";

    private static final String PASSWORD_ALLOW_BASE = CHAR_LOWER + CHAR_UPPER + NUMBER + OTHER_CHAR;
    // optional, make it more random
    private static final String PASSWORD_ALLOW_BASE_SHUFFLE = shuffleString(PASSWORD_ALLOW_BASE);
    private static final String PASSWORD_ALLOW = PASSWORD_ALLOW_BASE_SHUFFLE;

    private static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {

        System.out.format("String for password \t\t\t: %s%n", PASSWORD_ALLOW_BASE);
        System.out.format("String for password (shuffle) \t: %s%n%n", PASSWORD_ALLOW);
        System.out.println(" TYPE HOW MANY CHARACTERS YOU WANT YOUR PASSWORD TO HAVE");
        int length = 0;
        length = UserInputInt();
        System.out.println(" TYPE HOW MANY PASSWORDS YOU WANT TO GENERATE:");
        int number =0;
        number = UserInputInt();
        // generate 5 random password
        for (int i = 0; i <number; i++) {
            System.out.println("password : " + generateRandomPassword(length));
            System.out.println("\n");
        }

    }

    public static String generateRandomPassword(int length) {
        if (length < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {

            int rndCharAt = random.nextInt(PASSWORD_ALLOW.length());
            char rndChar = PASSWORD_ALLOW.charAt(rndCharAt);

            // debug
            System.out.format("%d\t:\t%c%n", rndCharAt, rndChar);

            sb.append(rndChar);

        }

        return sb.toString();

    }

    // shuffle ca sa se schimbe "seed-ul"
    public static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        return letters.stream().collect(Collectors.joining());
    }
    // user input
    public  static int UserInputInt() {
        Scanner scanner = new Scanner(System.in);
        int ch = 0;
        try {
            ch = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Numbers only, please.");
            UserInputInt();
        }
        return ch;
    }
}
