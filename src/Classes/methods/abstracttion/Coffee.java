package Classes.methods.abstracttion;

public class Coffee extends Liquid {

    String coffeeBeans;
    String antioxidant;

    public Coffee(double tempOfBoiling, String coffeeBeans, String antioxidant) {
        super(tempOfBoiling);
        this.coffeeBeans=coffeeBeans;
        this.antioxidant=antioxidant;
    }


    @Override
    public void TempOfBoiling() {
        super.TempOfBoiling();
        System.out.println("The boiling temperature of coffee is"+ " "+ tempOfBoiling);
    }

    @Override
    public void GetAllFeatures() {
        super.GetAllFeatures();
        System.out.println("coffeeBeans:"+ " " + coffeeBeans);
        System.out.println("antioxidane"+ " "+ antioxidant);
    }

    public String getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(String coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }
    public String getAntioxidant() {
        return antioxidant;
    }

    public void setAntioxidant(String antioxidant) {
        this.antioxidant = antioxidant;
    }

}
