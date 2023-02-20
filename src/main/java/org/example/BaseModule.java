package org.example;

public class BaseModule {                               //This is a super class

    String location  = "At class and online";
    void infoModule (){
        System.out.println("Module information");
    }

    void endCourse(String date){
        System.out.println("End of the module is on: " + date);
    }
}
