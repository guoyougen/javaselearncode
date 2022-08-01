package com.se.day10;

public interface IBookService {
    int MAX=100;
    void addBook(Book b);
    void deleteByIsbn(String isbn);
    void deleteByAuthor(String author);
    void updateBook(Book b);
    int size();
    void clear();
    Book selectByIsbn(String isbn);
    Book[] getAllBooks();
}
