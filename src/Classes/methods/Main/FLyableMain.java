package Classes.methods.Main;

import Classes.methods.ABC.A;
import Classes.methods.FlyableInterfaces.Flyable;
import Classes.methods.FlyableInterfaces.FlyableClasses.Airplane;
import Classes.methods.FlyableInterfaces.FlyableClasses.Duck;
import Classes.methods.FlyableInterfaces.FlyableClasses.Parrot;

public class FLyableMain {
    public static void main(String[] args) {
        Airplane[] A = {new Airplane(160, "F-16"), new Airplane(170, "B-52"), new Airplane(180, "U-2")};
        Duck[] D = {new Duck("Mallard", "brown"), new Duck("Domestic", "white"), new Duck("Scoter", "Black")};
        Parrot[] P = {new Parrot("Chico", "yellow"), new Parrot("Jako", "grey"), new Parrot("Kesha", "green")};
        FindSecondArg(A, new Airplane(160, "F-16"));

    }


    private static <T extends Comparable<T>, implements static Flyable <T>> FindSecondArg(T [] x, T y) {
        for (int i = 0; i < x.length; i++) {
            if (y.equals(x[i])) {
                return y;
            }
        }
        return null;


    }
}