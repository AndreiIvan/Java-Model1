package Generics;

public class GenClass2<T,V> {

    T val1;     //one data type
    V val2;     //another data type

    GenClass2(T val1, V val2){      //setter method
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1(){
        return val1;
    }

    public V getVal2(){
        return val2;
    }
}
