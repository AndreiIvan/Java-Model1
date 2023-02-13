package org.example;
import java.util.Scanner;
public class ExConditions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give me a grade");
        String name = input.next();
        int iGrade = Integer.parseInt(name);
        if (iGrade < 5)
            System.out.println("insufficient");
        if ( iGrade <=6 && iGrade >=5)
            System.out.println("sufficient");
        if (iGrade <9 && iGrade >6)
            System.out.println("good");
        if (iGrade >8)
            System.out.println("very good");
        else
            System.out.println("grade unknown");

        //System.out.println(iGrade);

    }
}
