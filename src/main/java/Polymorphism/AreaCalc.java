package Polymorphism;

public class AreaCalc {
    public void area (int r)
    {
        System.out.println("Circle area is " + 3.14*r*r);
    }

    public void area (double d, double h)
    {
        System.out.println("Triangle area is: " + 0.5*d*h);
    }

    public static void main(String[] args) {
        AreaCalc Shapes = new AreaCalc();
        Shapes.area(5);
        Shapes.area(8.0,1.5);
    }
}
