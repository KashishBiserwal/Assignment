package com.bookUtil;

import com.book.Book;
import com.book.BookStore;
import com.book.InvalidBookException;

public class BookUtil {
    public static void main(String[] args) throws InvalidBookException {
        BookStore bs = new BookStore();
        bs.addBook(new Book(1, "Circe", "Madeline Miller"));
        bs.addBook(new Book(2, "Jane Eyre", "Charlotte Bronte"));
        bs.addBook(new Book(3, "Norwegian Wood", "Haruki Murakami"));
        bs.searchByTitle("Norwegian Wood");
        bs.searchByAuthor("Charlotte Bronte");
    }
}