package Classes.methods.TV;

public class TV {
    private double length;
    private double width=30;
    private String typeOfTV;
    private String model;

    public TV(double length1, String typeofTV1, String model1) {
        typeOfTV=typeofTV1;
        setLength(length1);
        setModel(model1);

    }

    public TV(double l, double w, String t, String m) {
        setLength(l);
        setModel(m);
        typeOfTV=t;
        width=w;
    }

    public void setLength(double length2) {
        if (length > 0 && length < 106) {
            length = length2;
        } else {
            System.out.println("out of range");
        }
    }

    public double getLength() {

        return length;
    }

    public void setModel(String model2) {
        if(model2.charAt(0)=='S') {
            model = model2;
        }  else {
            System.out.println("the name of the model should start with S");
    }

    }
    public String getModel() {
        return model;
    }

      public void Print() {
         double l1=length;
         double w2=width;
         String t2=typeOfTV;
         String m2=model;
          System.out.println(l1);
          System.out.println(w2);
          System.out.println(t2);
          System.out.println(m2);
      }

}

