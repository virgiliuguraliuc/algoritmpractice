package org.fasttrackit;

import org.springframework.security.crypto.bcrypt.BCrypt;


import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        String username = "";
        String password = "";
        String hashedPassword = "";
        System.out.println("what will be your username");
        username =  Input();
        System.out.println("what will be your password?");
        hashedPassword= hash(Input());

        System.out.println("LETS TEST YOUR PASSWORD");
        if (
        checkPassword(Input(),hashedPassword) == true) {
            System.out.println("pASS ok");}
        else{
            System.out.println("wrong pass");
        }
    }

    public static String Input(){
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.next();
     return word;
    }

    public static String hash(String password_plaintext){
        String salt = BCrypt.gensalt();
        String hashed_pass =BCrypt.hashpw(password_plaintext, salt);
        return hashed_pass;
    }

    public static boolean checkPassword(String password_plaintext, String stored_hash) {
        boolean password_verified = false;

        if(null == stored_hash || !stored_hash.startsWith("$2a$"))
            throw new java.lang.IllegalArgumentException("Invalid hash provided for comparison");

        password_verified = BCrypt.checkpw(password_plaintext, stored_hash);

        return(password_verified);
    }

}
