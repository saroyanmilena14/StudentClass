package Classes.methods.Main;

import Classes.methods.Student.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student s1=new Student("Lucy", 3.5);
        Student s2=new Student ("Lilit", 3.2);
        Student s3=new Student("Lana", 3.6);
        System.out.println(s1.getId());
        System.out.println(s2.getId());
        System.out.println(s3.getId());
    }
}
