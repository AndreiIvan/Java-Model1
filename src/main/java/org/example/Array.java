package org.example;

import java.util.Scanner;

public class Array {                                // Don't name the class Arrays
    public static void main(String[] args) {

        // Used to store multiple values in a single variable
        // An Array is composed of Elements and each of them has an Index
        // Each Element must be the same data type that is declared for that Array

        int [] grades = {5,6,7,8,9,10};
        System.out.println("The first element is: " + grades[0]);

        String [] progLang = {"C", "C++", "Java", "Python", "JavaScript", "PHP"};
        progLang[1] = "SQL";                  // Give a new value to an existing element
        System.out.println(progLang[1]);

        // Alternative way to create an Array
        String [] webServices = new String[3];
        webServices[0] = "XAMPP";
        webServices[1] = "Tomcat";
        webServices[2] = "WildFly";

        System.out.println(webServices[2]);

        //from comparison
/*
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter yoiur from the list");

        int Module = scan1.nextInt();

        switch (Module) {
            case 1:
                System.out.println("Module nr." + Module + " is Agile");
                break;
            case 2:
                System.out.println("Module nr." + Module + " is Data Visualisation");
                break;
            case 3:
                System.out.println("Module nr." + Module + " is Version Control");
                break;
            case 4:
                System.out.println("Module nr." + Module + " is Python");
                break;
            case 5:
                System.out.println("Module nr." + Module + " is Testing");
                break;
            case 6:
                System.out.println("Module nr." + Module + " is API");
                break;
            case 7:
                System.out.println("Module nr." + Module + " is Java");
                break;
        }
*/

        //loops
        for (int i=0; i<3; i++)
        {
            System.out.println(i);
        }

        int wl = 0;
        while (wl<2){
            System.out.println("The initial value of wl is: " + wl);
            wl++;
        }

       // String [] progLang = {"C++", "Java", "Python"};
        for (String prog : progLang){
            System.out.println(prog);
        }

    }
}
