package Classes.methods.Main;

import Classes.methods.Author.Author;
import Classes.methods.Book.Book;

public class BookMain {

    public static void main(String[] args) {
        Book b1 = new Book ("The Great Gatsby", 45, "Drama");
        Book b2 = new Book ("Tender is the Night", 56, "Novel");
        Book b3= new Book ("Pride and Prejudice", 67, "Romance novel");
        Book b4= new Book ("The Picture of Dorian Gray", 78, "Gothic fiction");
        Book b5= new Book ("Sense and Sensibility", 70, "Novel");
        Book b6= new Book ("The Happy Prince", 90, "Novel");


       Author a1= new Author("Jane", "Austin",new Book[]{b3,b5});
       Author a2=new Author("Oscar", "Wilde", new Book[]{b4,b6});
       Author a3=new Author("Scott", "Fitzgerald", new Book[]{b1,b2});

        String Name1 = "Jane Eyre";
        Book book1 =  a1.getBook(Name1);
        if(book1!=null){
            book1.printBook();
        }else {
            System.out.println("The book with name " + "'" + Name1 + "'" + " is not found ");
        }
        String Name2 = "The Great Gatsby";
        Book book2 =  a3.getBook(Name2);
        if(book2!=null) {
            book2.printBook();
        } else {
            System.out.println("The book with name " + "'" + Name2 + "'" + " is not found");
        }
        String Name3= "Harry Potter";
        Book book3 =a3.getBook(Name3);
        if(book3!=null){
            book3.printBook();
        }  else {
            System.out.println("The book with name " + "'" + Name3 + "'" + " is not found");
        }
}
}