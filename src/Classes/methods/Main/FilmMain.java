package Classes.methods.Main;

import Classes.methods.Film.Film;



public class FilmMain {
    public static void main(String[] args) {

        Film [] obj = new Film [3];
                obj[0]= new Film ("Pulp Fiction ", "triller", 2.34, " Quentin Tarantino");
                obj [1]= new Film ("The Gentlmen", "criminal, comedy", 1.53, "Guy Ritchie");
                obj [2]= new Film ("Jojo Rabbit ", "comedy, drama", 1.48, "Taika Waititi");

         for (int i=0; i< obj.length; i++ ){

             System.out.println(obj[i].print());
        }
    }


}
