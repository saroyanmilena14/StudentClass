package Classes.methods;


import Classes.methods.Student.Student;

import java.util.ArrayList;

public class CollectionsClasses {

        public static void main(String[] args) {

            ArrayList<Student> studentslist = new ArrayList<>();
            studentslist.add(new Student("Mane",3.4));
            studentslist.add(new Student("Meri", 3.21));
            studentslist.add(new Student("Armen", 2.78));
            studentslist.add(new Student("Nina", 3.65));
            studentslist.add(4,new Student("Varduhi", 2.9));

            Student student1=new Student("Varduhi", 2.9);
            Student student2=new Student("Mane", 3.4);

            System.out.println(studentslist.size());
            System.out.println(studentslist);

            studentslist.remove(3);
            System.out.println(studentslist);
            boolean contain = studentslist.contains(student2);
            System.out.println(contain);

}
}