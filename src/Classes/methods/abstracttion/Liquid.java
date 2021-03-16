package Classes.methods.abstracttion;

abstract public class Liquid {

    private double tempOfBoiling;

    public Liquid(double tempOfBoiling){
        this.tempOfBoiling=tempOfBoiling;
    }



     abstract public double Density() ;

    public void GetAllFeatures() {
        System.out.println("tempBoiling:" + " " +tempOfBoiling);
    }


    public double getTempOfBoiling() {
       return tempOfBoiling;
    }

    public void setTempOfBoiling(double tempOfBoiling) {
        this.tempOfBoiling = tempOfBoiling;
    }

}
