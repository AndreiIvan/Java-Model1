package Generics;

public class MainGeneric {
    public static void main(String[] args) {
/*      1. non-generic classes with different data types
        IntClass newInt1 = new IntClass (8);
        CharClass newChar1 = new CharClass('x');

        System.out.println(newInt1.GetVal());
        System.out.println(newChar1.GetVal());
  */
/*      2. Generic class with one parameter (one data type)
        GenClass1<Integer> newInt2 = new GenClass1<>(8);
        GenClass1<Character> newChar2 = new GenClass1<>('x');
        System.out.println(newInt2.getVal());
        System.out.println(newChar2.getVal());
*/
        //GenClass2<Integer, Integer> newInt3 = new GenClass2<>(3, 4);
       /*
        GenClass2<Integer, Character> newInt3 = new GenClass2<>(3, 'X');
        System.out.println(newInt3.getVal1());
        System.out.println(newInt3.getVal2());
        */

        Numerics<Integer> calc = new Numerics<>(4);
        System.out.print(calc.square());
    }

}
