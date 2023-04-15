package com.book;

import java.util.ArrayList;

public class BookStore {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b){
        books.add(b);
    }

    public void searchByTitle(String title) throws InvalidBookException{
        Book book = null;
        for(Book b: books){
            if(b.getTitle().equals(title)) book = b;
        }
        if(book == null) throw new InvalidBookException("Book with title not found");
        System.out.println(book);

    }

    public void searchByAuthor(String author) throws InvalidBookException {
        Book book = null;
        for(Book b: books){
            if(b.getAuthor().equals(author)) book = b;
        }
        if(book == null) throw new InvalidBookException("Book with author not found");
        System.out.println(book);


    }

    public void displayAll(){
        for (Book b: books){
            System.out.println(b);
        }
    }
}

