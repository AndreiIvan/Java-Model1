package Generics;

public class GenClass1<T> {

    T v1;
    GenClass1(T v1){         //setter class
        this.v1 = v1;
    }

    public T getVal(){      //getter method

        return v1;
    }
}
