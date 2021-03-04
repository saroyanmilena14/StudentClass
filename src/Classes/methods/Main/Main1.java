package Classes.methods.Main;

import Classes.methods.Circles.Circle;

public class Main1 {
    public static void main(String[] args) {

        Circle C1 = new Circle(6,-4, 5);
        Circle C2= new Circle(5.5);
        System.out.println(C1.LengthofCircle());
        System.out.println(C1.SofCircle());
        System.out.println(C2.SofCircle());
        System.out.println(C2.LengthofCircle());
        System.out.println(C1.getX());
        System.out.println(C1.getY());
        System.out.println(C1.getRadius());
        System.out.println(C2.getX());
        System.out.println(C2.getY());
        System.out.println(C2.getRadius());
        Circle C3= new Circle();
        C3.x=7;
        C3.y=8;
        System.out.println(C3.x);
        System.out.println(C3.y);
    }
}