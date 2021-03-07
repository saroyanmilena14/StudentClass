package Classes.methods.Circles;

    public class Circle {

        private double Radius;
        public double x=6 ;
        public double y=4 ;


        public Circle(double r, double x1, double y1) {
            x = x1;
            y = y1;
            setRadius(r);
        }
        public Circle() {}

        public Circle(double r1) {
            setRadius(r1);
        }

        public double LengthofCircle() {
            double C = 0;
            C = 2 * 3.14 * Radius;

            return C;
        }

        public double SofCircle() {
            double S = 0;

                S = 3.14 * (Radius * Radius);

            return S;
        }

        public void setRadius(double R) {
            if (R > 0) {
                Radius = R;
            } else {
                System.out.println("invalid input");
            }
        }

        public double getRadius() {
            return Radius;
        }



    }