package package2;

//import package1.Class1;
import package1.*;

public class SubClass1 extends Class1 {

    public static void main(String[] args) {

        //class3 C3 = new class3();
        //System.out.println(C3.defVar);
        SubClass1 sub  = new SubClass1();
        System.out.println(sub.proVar);
    }
}
