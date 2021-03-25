package Classes.methods.Interfaces.Classes;

import Classes.methods.Interfaces.BackMovable;
import Classes.methods.Interfaces.ForwardMoveable;
import Classes.methods.Interfaces.Movable;

public class Escalator implements Movable, ForwardMoveable, BackMovable {

    private int speed;


    @Override
    public int sp() {
        return speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Escalator(int speed) {
        this.speed = speed;
    }

    @Override
    public void moveBack() {
        System.out.println("The escalator moves back automaticallly");

    }

    @Override
    public void moveForward() {
        System.out.println("The escalator moves forward automatically.");
    }
    @Override
       public String toString () {
        return "Escalator's speed is" + " " + speed;
    }
    @Override
    public int compareTo(Object o) {
        Movable m = (Movable) o;
        if(this.sp()>m.sp()) {
            return 1;
        }
        if (this.sp()<m.sp()) {
            return -1;
        }
        return 0;
    }
}
