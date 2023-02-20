package package1;

import package2.Class3;


public class Class1 {

    protected String proVar = "Protected value";
    public static void main(String[] args) {

        Class3 C3 = new Class3();
        //System.out.println(C3.defVar);
        System.out.println(C3.pubVar);

        //Class2 C2 = new Class2();
        //System.out.println(C2.priVar);
    }
}
