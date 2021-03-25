package Classes.methods.FlyableInterfaces.FlyableClasses;

import Classes.methods.FlyableInterfaces.Flyable;

public class Duck implements Flyable {
    private String type;
    private String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public Duck(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public void fly() {
        System.out.println("Duck's jump.");
    }

    public boolean equals(Object o) {
        if (!(o instanceof Duck))
            return false;
        Duck d = (Duck) o;
        return d.getColor() == this.getColor();
    }
}
