package Classes.methods.generics;

public class generics3 <T>{
    public generics3(T t) {
        this.t = t;
    }

    private T t;
    public void set(T t) {
        this.t=t;
    }
    public T getT(){
        return t;
    }
}
