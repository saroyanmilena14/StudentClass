package Classes.methods.Interfaces.Classes;

import Classes.methods.Interfaces.Movable;
import Classes.methods.Interfaces.RightLeftMovable;



public class LiftDoor implements Movable, RightLeftMovable {

    private int speed;

    public LiftDoor(int speed) {
        this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;

    }

    @Override
    public void moveRight() {
        System.out.println("The door of the lift moves right");
    }

    @Override
    public void moveLeft() {
        System.out.println("The door of the lift moves right as well.");
    }
    @Override
    public int sp() {
        return speed;
    }

    @Override
    public String toString() {
        return "Lift door's speed is " + " " +speed;
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
