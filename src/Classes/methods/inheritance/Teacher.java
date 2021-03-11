package Classes.methods.inheritance;

public class Teacher {

      private String fullName;
      private String profession;
      private double salary;

      public Teacher (String fullName, String profession, double salary) {
            this.fullName=fullName;
            this.profession=profession;
            this.salary=salary;

      }


      public Teacher() {}
      public String getFullName() {
            return fullName;
      }

      public void setFullName(String fullName) {
            this.fullName = fullName;
      }

      public String getProfession() {
            return profession;
      }

      public void setProfession(String profession) {
            this.profession = profession;
      }

      public double getSalary() {
            return salary;
      }

      public void setSalary(double salary) {
            this.salary = salary;
      }

}