package Classes.methods.Student;

public class Student {

    private String name;
    private double rating;
    public static double id;



    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        id++;
    }

    public Student() {
        id++;
    }

    public Student(String n) {
        name=n;
        id++;
    }
}

