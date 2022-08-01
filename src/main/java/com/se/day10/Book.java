package com.se.day10;

/**
 * @projectname: learn
 * @packname: com.se.day10
 * @classname: Book
 * @author: gyg
 * @date: 2022/7/20 下午 1:23
 * @version: 1.0
 * @description: TODO
 */

public class Book {
    private long id;
    private static long idincrease=9l;
    private String bookname;
    private String bookauthor;
    private String isbn;
    public Book(String bookname,String bookauthor,String isbn){
          this.id=idincrease++;
          this.bookname=bookname;
          this.bookauthor=bookauthor;
          this.isbn=isbn;
    }
    public Book(){

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", bookauthor='" + bookauthor + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static long getIdincrease() {
        return idincrease;
    }

    public static void setIdincrease(long idincrease) {
        Book.idincrease = idincrease;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
