package Classes.methods.inheritance;

public class MathsTeacher extends Teacher {

      private String mainSubject;


     public MathsTeacher (String fullName, String profession, double salary, String mainSubject) {
         super(fullName, profession, salary);
         this.mainSubject=mainSubject;
     }

     public MathsTeacher () {}
     public String getMainSubject () {
         return mainSubject;
     }
     public void setMainSubject (String mainSubject) {
         this.mainSubject=mainSubject;
     }

}
