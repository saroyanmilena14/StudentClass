package Classes.methods.abstracttion;

public class Wine extends Liquid{

       String alcohol;
       String grapes;

    public Wine(double tempOfBoiling, String alcohol,  String grapes) {
        super(tempOfBoiling);
        this.alcohol=alcohol;
        this.grapes=grapes;
    }

    @Override
    public void TempOfBoiling() {
        super.TempOfBoiling();
        System.out.println("The boiling temperature of wine is " + " "+ tempOfBoiling);
    }
    @Override
    public void GetAllFeatures() {
        super.GetAllFeatures();
        System.out.println("alcohol:"+ " "+ alcohol);
        System.out.println("grapes:"+ " "+ grapes);
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

}
