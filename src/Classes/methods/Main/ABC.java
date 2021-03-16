package Classes.methods.Main;

import Classes.methods.ABC.A;
import Classes.methods.ABC.B;
import Classes.methods.ABC.C;

public class ABC {
    public static void main(String[] args) {
        A a1 = new A("Nina", 10);
        B b1 = new B("Frida", 34, "Smith");
        C c1 = new C("Jughead", 14, "Caxkakaxamb");
        System.out.println(c1.getName());
        System.out.println(c1.getNickname());
    }
}
