package Classes.methods.Student;

public class Student {
    private String name;
    private double gpa;
    private String surName;



    public Student(String name, String surName, double gpa) {
        this.name = name;
        this.gpa = gpa;
        this.surName=surName;

    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Student (String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    public String toString() {
        return "Student's name:"+ name+ " "+ ",surname:"+ surName+ " "+"and her/his gpa:"+ " "+ gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student))
            return false;
        Student s = (Student) o;
        return s.getName() == this.getName() && s.getSurName()==this.getSurName();
    }
    @Override
    public int hashCode () {
        return 0;
    }


}

