package Classes.methods.Film;

import com.sun.security.jgss.GSSUtil;

public class Film {


    private  String name;
     private  String genre;
     private  double runtime;
     private  String directorName;



     public Film (String name, String genre, double runtime, String directorName) {
         this.name=name;
         this.genre=genre;
         this.runtime=runtime;
         this.directorName = directorName;


     }

     public void setName(String name){
         this.name=name;
     }
     public String getName () {
         return name;
     }

     public void setGenre(String genre) {
         this.genre=genre;
     }
     public String getGenre() {
         return genre;
     }
     public void setDuration (double duration) {
         this.runtime=duration;
     }
     public double getDuration () {
         return runtime;
     }
     public void setDirectorName(String directorName) {
         this.directorName=directorName;
     }
     public String getDirectorName () {
         return directorName;
     }

     public String  print () {
         String  res="";
         return res = "The film is called" + " " + name + ",genre is" + " " +genre + ",its runtime is " + " " + runtime + " " +"and finally the film is directed by" + " "+ directorName + ".";
     }
}