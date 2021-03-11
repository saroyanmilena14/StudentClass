package Classes.methods.Author;

import Classes.methods.Book.Book;

public class Author {

    private String name;
    private String surName;
    private int yearOfBirth;
    private Book[] books;

    public Author (String name , String surName, int yearOfBirth, Book[] books ) {
          this.name=name;
          this.surName=surName;
          this.yearOfBirth=yearOfBirth;

    }

      public void setBooks (Book [] books) {
          if(books.length>0) {
              this.books=books;
          }
      }
      public Book[] getBooks () {
        return books;
      }


}

