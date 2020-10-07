package ru.mirea.uybin.pr1;
import java.lang.*;

public class Book {
    private String Bookname;
    private String Author;

    public Book(String bookname, String author) {
        Bookname = bookname;
        Author = author;
    }

    public Book(String bookname) {
        Bookname = bookname;
    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Bookname='" + Bookname + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
