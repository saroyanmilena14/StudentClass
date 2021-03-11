package Classes.methods.inheritance2;

public class  ThreeDPoint extends  TwoDPoint {

    private double z;


    public ThreeDPoint (double x, double y, double z) {
        super(x, y);
        this.z=z;
    }

    public double  SquareOfDistance3D (ThreeDPoint P) {
        return ((P.getX()-this.getX())*(P.getX()-this.getX())+((P.getY()-this.getY())*(P.getY()-this.getY())+((P.z-this.z)*(P.z-this.z))));
    }

    public void  MidPoint3D (ThreeDPoint P1) {
         double x2=(P1.getX()+this.getX())/2;
         double y2=(P1.getY()+this.getY())/2;
         double z2=(P1.z+this.z)/2;
         System.out.println("x2=" + x2);
         System.out.println("y2=" + y2);
         System.out.println("z2=" + z2);

    }

    public double getZ () {
        return z;
    }

    public void setZ (double z) {
        this.z=z;
    }



}
