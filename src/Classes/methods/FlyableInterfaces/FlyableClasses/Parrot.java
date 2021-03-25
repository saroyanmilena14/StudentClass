package Classes.methods.FlyableInterfaces.FlyableClasses;

import Classes.methods.FlyableInterfaces.Flyable;

public class Parrot implements Flyable {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Parrot(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void fly() {
        System.out.println("Parrot's jerk.");
    }

    public boolean equals(Object o) {
        if (!(o instanceof Parrot))
            return false;
        Parrot p = (Parrot) o;
        return p.getName() == this.getName();
    }

    @Override
    public String toString() {
        return "Parrot's name is"+ " "+ name+ "and its color is"+ " "+ color;
    }

}
