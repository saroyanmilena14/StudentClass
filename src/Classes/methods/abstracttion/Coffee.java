package Classes.methods.abstracttion;

public class Coffee extends Liquid {

    private String coffeeBeans;
    private String antioxidant;
    private double coffeeAmount;
    private double waterAmount;


    public Coffee(double tempOfBoiling, String coffeeBeans, String antioxidant, double coffeeAmount, double waterAmount) {
        super(tempOfBoiling);
        this.coffeeBeans=coffeeBeans;
        this.antioxidant=antioxidant;
        this.coffeeAmount=coffeeAmount;
        this.waterAmount=waterAmount;
    }

    @Override

    public double Density () {
        return coffeeAmount/waterAmount;
    }


    @Override
    public void GetAllFeatures() {
        super.GetAllFeatures();
        System.out.println("coffeeBeans:"+ " " + coffeeBeans);
        System.out.println("antioxidane"+ " "+ antioxidant);
        System.out.println("coffeeAmount"+ " "+ coffeeAmount);
        System.out.println("waterAmount"+ " "+ waterAmount);
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
    public double getCoffeeAmount() {
        return coffeeAmount;
    }

    public void setCoffeeAmount(double coffeeAmount) {
        this.coffeeAmount = coffeeAmount;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }


}
