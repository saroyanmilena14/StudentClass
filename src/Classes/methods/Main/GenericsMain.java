package Classes.methods.Main;

import Classes.methods.generics.generics;
import Classes.methods.generics.generics3;

public class GenericsMain {
    public static void main(String[] args) {
        generics g1= new generics(6,"cdhs");
        generics g2= new generics(7.0, "r");
        generics g3= new generics(567, "fef");
        System.out.println(g3.getGenT());
        System.out.println(g2.getGenV());
        System.out.println(g1.getGenT());
        System.out.println(g2.getGenT());
        generics3 <Number> g5= new generics3 <>(4.5);
        System.out.println(g5.getT());


    }
}
