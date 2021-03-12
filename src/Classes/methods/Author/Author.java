package Classes.methods.Author;

import Classes.methods.Book.Book;

public class Author {

    private String name;
    private String surName;
    private Book[] book;

    public Author (String name , String surName,  Book[] book ) {
        setName(name);
        this.surName = surName;
        setBook(book);
    }
    public Book[] getBook() {
        return book;
    }
    public void setBook(Book[] book) {
        if(book.length > 0) {
            this.book = book;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {

            this.name = name;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Book getBook(String searchBook) {
        for (int i = 0; i < book.length; i++) {
            if (book[i].getTitle().equals(searchBook)) {
                return book[i];
            }
        }
        return null;
    }



}

