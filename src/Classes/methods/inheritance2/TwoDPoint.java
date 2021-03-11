package Classes.methods.inheritance2;

public class TwoDPoint {

    private double x;
    private double y;



    public TwoDPoint (double x, double y) {
         this.x=x;
         this.y=y;
    }

    public double SquareOfDistance ( TwoDPoint P) {
         return (P.x-this.x)*(P.x- this.x) + (P.y- this.y)*(P.y- this.y);
    }

    public void MidPoint (TwoDPoint P1) {
        double x1;
        double y1;
        x1 = (P1.x + this.x) / 2;
        y1 = (P1.y + this.y) / 2;
        System.out.println("x1=" + x1);
        System.out.println("y1=" + y1);
    }


    public double getX () {
        return x;
    }

    public void setX (double x) {
        this.x=x;
    }

    public double getY () {
        return y;
    }

    public void setY (double y) {
        this.y=y;
    }

}

