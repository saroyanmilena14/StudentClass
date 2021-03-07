package Classes.methods.Main;

import Classes.methods.Student.Student;

public class Main3 {
    public static void main(String[] args) {
        Student s1=new Student("Lucy", 3.5);
        System.out.println(s1.id);
        Student s3=new Student ("Lilit");
        System.out.println(s3.id);
        Student s2=new Student();
        System.out.println(s2.id);
    }
}
