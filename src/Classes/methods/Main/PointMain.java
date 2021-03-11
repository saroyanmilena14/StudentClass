package Classes.methods.Main;

import Classes.methods.inheritance2.ThreeDPoint;
import Classes.methods.inheritance2.TwoDPoint;

public class PointMain {


    public static void main(String[] args) {

        TwoDPoint p1 = new TwoDPoint(5, 6);
        TwoDPoint p2 = new TwoDPoint(8,8);
        System.out.println(p1.SquareOfDistance(p2));
        ThreeDPoint p3= new ThreeDPoint(4,-5,7);
        ThreeDPoint p4= new ThreeDPoint( 8,6,4);
        System.out.println(p3.SquareOfDistance3D(p4));
        p1.MidPoint(p2);
        p3.MidPoint3D(p4);

    }
}