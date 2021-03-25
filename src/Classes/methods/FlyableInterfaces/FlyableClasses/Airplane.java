package Classes.methods.FlyableInterfaces.FlyableClasses;

import Classes.methods.FlyableInterfaces.Flyable;

public class Airplane implements  Flyable{
    private int speed;
    private String model;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public Airplane(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println("Airplane's flight.");
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Airplane))
            return false;
        Airplane a = (Airplane) o;
        return a.getModel() == this.getModel();
    }

    @Override
    public String toString() {
        return "Airplane's speed is"+ " "+speed + " " +",model is" + model;
    }
}
