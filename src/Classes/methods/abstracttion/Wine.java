package Classes.methods.abstracttion;

public class Wine extends Liquid{

       private String alcohol;
       private String grapes;
       private double amountAlcohol;
       private  double amountGrapes;

    public Wine(double tempOfBoiling, String alcohol,  String grapes, double amountAlcohol, double amountGrapes) {
        super(tempOfBoiling);
        this.alcohol=alcohol;
        this.grapes=grapes;
        this.amountAlcohol=amountAlcohol;
        this.amountGrapes=amountGrapes;
    }

    @Override
    public double Density () {
        return amountAlcohol*0.4+amountGrapes*0.6;
    }

    @Override
    public void GetAllFeatures() {
        super.GetAllFeatures();
        System.out.println("alcohol:"+ " "+ alcohol);
        System.out.println("grapes:"+ " "+ grapes);
        System.out.println("amountAlcohol"+" "+ amountAlcohol);
        System.out.println("amountGrapes"+ " "+amountGrapes);
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }


    public String getGrapes() {
        return grapes;
    }

    public void setGrapes(String grapes) {
        this.grapes = grapes;
    }

    public double getAmountAlcohol() {
        return amountAlcohol;
    }

    public void setAmountAlcohol(double amountAlcohol) {
        this.amountAlcohol = amountAlcohol;
    }

    public double getAmountGrapes() {
        return amountGrapes;
    }

    public void setAmountGrapes(double amountGrapes) {
        this.amountGrapes = amountGrapes;
    }


}
