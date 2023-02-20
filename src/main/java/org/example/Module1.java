package org.example;

public class Module1 extends BaseModule{            //this is a subclass

    int duration = 16;
    String subject = "Methodologies / Project management";
    String Test = "a test based on main concepts presented in the module";
    String location = "doar online";

    public void display (){
        System.out.println("Presented" + super.location);
    }

}
