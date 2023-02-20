package org.example;

public class MainCourses {

    public static void main(String[] args) {
        SubjectsC sub1 = new PythonC();
        SubjectsC sub2 = new JavaC();

        sub1.courseContent();
        sub1.codeCompiler();
        sub1.courseDuration(48);

        JavaC javelin = new JavaC();
        javelin.codeCompiler();
    }
}
