package Classes.methods.Student;

public class Student {

    private String name;
    private double rating;
    private  int id;
    private static int c;




    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        c++;
        id=c;
    }
    public int getId (){
        return id;
    }

}

