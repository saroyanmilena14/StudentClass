package Classes.methods.Main;

import Classes.methods.FlyableInterfaces.Flyable;
import Classes.methods.FlyableInterfaces.FlyableClasses.Airplane;
import Classes.methods.FlyableInterfaces.FlyableClasses.Duck;
import Classes.methods.FlyableInterfaces.FlyableClasses.Parrot;

public class FLyableMain {
    public static void main(String[] args) {
        Airplane A1 =new Airplane(160, "F-16");
        Airplane A2 =new Airplane(170, "B-52");
        Airplane A3=new Airplane(180, "U-2");
        Airplane [] airplanes = {A1, A2, A3};
        System.out.println(FindSecondArg(airplanes, A2));
        System.out.println();

        Duck D1=new Duck("Mallard", "brown");
        Duck D2=new Duck("Domestic", "white");
        Duck D3=new Duck("Scoter", "Black");
        Duck [] ducks= {D1, D3};
        System.out.println(FindSecondArg(ducks,D2));
        System.out.println();

        Parrot P1 = new Parrot("Chico", "yellow");
        Parrot P2=new Parrot("Jako", "grey");
        Parrot P3=new Parrot("Kesha", "green");
        Parrot [] parrots={P1, P2, P3};
        System.out.println(FindSecondArg(parrots,P1));

    }


    private static <T extends Flyable> T FindSecondArg (T [] x, T y) {
        for (int i = 0; i < x.length; i++)
            if (y.equals(x[i])) {
                return y;
            }
        return null;


    }
}