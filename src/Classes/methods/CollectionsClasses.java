package Classes.methods;


import Classes.methods.Student.Student;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionsClasses {


    public static void main(String[] args) {

            ArrayList<Student> studentslist = new ArrayList<>();
            studentslist.add(new Student("Mane", "Sargsyan", 3.5));
            studentslist.add(new Student("Mane","Sargsyan",2.87));
            studentslist.add(new Student("Armen","Sargsyan", 2.56));
            studentslist.add(new Student("Mane","Sargsyan" ,3.9));
            studentslist.add(new Student("Varduhi", "Vardanyan" ,3.21));




            HashSet<Student> uniqueElements = new HashSet<>(studentslist);
            for (Student s: uniqueElements) {
                System.out.println(s);
                    System.out.println();
            }



}
}