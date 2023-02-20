package org.example;

public class JavaI implements SubjectsI, TestInterface{


    @Override
    public void courseContent() {
        System.out.println("Java Fundamentals");
    }

    @Override
    public void codeCompiler() {

        System.out.println("With IntelliJ");

    }

    @Override
    public void courseDuration(int hours) {

        System.out.println("The course lasts" + hours + "and is worth " + hours +  " points") ;

    }
}
