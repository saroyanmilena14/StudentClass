package Classes.methods.generics;

import Classes.methods.Interfaces.Classes.LiftDoor;

public class generics<T extends Number,V extends String> {

    private T genT;
    private V genV;

    public T getGenT() {
        return genT;
    }

    public void setGenT(T genT) {
        this.genT = genT;
    }

    public V getGenV() {
        return genV;
    }

    public void setGenV(V genV) {
        this.genV = genV;
    }


    public generics(T genT, V genV) {
        this.genT = genT;
        this.genV = genV;

    }




}
