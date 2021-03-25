package Classes.methods.Main;

import Classes.methods.Interfaces.Classes.LiftDoor;
import Classes.methods.Interfaces.Classes.Escalator;
import Classes.methods.Interfaces.Movable;

import java.util.Arrays;

public class InterfacesMovementMain {

    public static void main(String[] args) {
        Movable[] movables = {new LiftDoor(100), new Escalator(130), new LiftDoor(140), new Escalator(50)};

        for (Movable movable : movables) {
            System.out.print(movable.toString());
            System.out.println();
        }
        Arrays.sort(movables);
        System.out.println();
        for (Movable movable : movables) {
            System.out.println(movable.toString());
        }


    }
}