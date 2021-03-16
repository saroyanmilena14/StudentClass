package Classes.methods.ABC;

public class B extends A{

    private String surname;

    public B (String name , int age , String surname) {
         super(name, age);
         this.surname=surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
