package Classes.methods.Book;

public class Book {

     private String title;
     private double price;
     private String genre;

     public Book(String title, double price, String genre) {
          setTitle(title);
          setPrice(price);
          setGenre(genre);
     }

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public double getPrice() {
          return price;
     }

     public void setPrice(double price) {
          if (price > 0) {
               this.price = price;
          }
     }

     public String getGenre() {
          return genre;
     }

     public void setGenre(String genre) {
          this.genre = genre;
     }

     public void printBook() {
          System.out.println("Book title is " + " " + title
                  + "Book genre is " + " " + genre
                  + "Book price is " + " " + price);


     }
}
