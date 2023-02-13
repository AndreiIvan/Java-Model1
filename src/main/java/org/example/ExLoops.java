package org.example;

import java.util.Scanner;

public class ExLoops {
    public static void main(String[] args) {
        String password="";
        String password1="";

        while (true){

            Scanner input = new Scanner(System.in);
            System.out.println("please input password");
            password = input.next();
            //Scanner input1 = new Scanner(System.in);
            password1 = password;
            if (password.equals("P@ssword0"))
                break;
            System.out.println("password: " + password + "and " + password1);
    }
        System.out.println("Login successful. Exiting");
    }
}
