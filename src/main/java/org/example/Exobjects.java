package org.example;

public class Exobjects {

    public static void main(String[] args) {

        Student newStudent = new Student();
        //newStudent.FirstName = "Vivien";
        newStudent.LastName = "Leigh";
        System.out.println("Full name: \n " + newStudent.FirstName + " " + newStudent.LastName);
        newStudent.calculateAge(1913);

    }
/*
    Create a "Student" class that has the following attributes:
    - First name
    - Last name
    - Year of birth
    - Phone number

    in the "ExObjects" class, create a student object
    Provide values for those attributes and print out: "Full name: first name & last name"
    Calculate his age with a method and print the result in the following format: "Age: (result of the calculation)"
    Print out the full phone number: "Phone number: 0xxxxxxxxx"
    */

}
