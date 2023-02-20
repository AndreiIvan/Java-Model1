package org.example;

public class PythonI implements SubjectsI {


    @Override
    public void courseContent() {
        System.out.println("Python Fundamentals") ;

    }

    @Override
    public void codeCompiler() {

        System.out.println("With Pycharm");

    }

    @Override
    public void courseDuration(int hours) {

        System.out.println("The course lasts" + hours*2 + " hours") ;

    }
}
