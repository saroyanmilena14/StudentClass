package Classes.methods.Main;

import Classes.methods.inheritance.MathsTeacher;
import Classes.methods.inheritance.Teacher;

public class InheritanceMain {
    public static void main(String[] args) {
        MathsTeacher teacher1 =new MathsTeacher("Mary Smith", "Teaching", 500, "Maths");
        System.out.println(teacher1.getFullName());
        System.out.println(teacher1.getProfession());
        System.out.println(teacher1.getSalary());
        System.out.println(teacher1.getMainSubject());
        Teacher teacher2 = new Teacher("Lucy Hale","Teaching", 300);
        System.out.println(teacher2.getFullName());
        System.out.println(teacher2.getProfession());
        System.out.println(teacher2.getSalary());
        MathsTeacher teacher3= new MathsTeacher();
        System.out.println(teacher3.getSalary());
        System.out.println(teacher3.getMainSubject());

    }
}
