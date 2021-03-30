package Classes.methods.Student;

public class Student {

    private String name;
    private double gpa;
    private  int id;





    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;

    }
    public String toString() {
        return "Student's name is:"+ name+ " "+ ",his/her gpa is:" + gpa;
    }

}

