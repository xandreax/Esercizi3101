package it.euris.academy2023.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void printAll(){
        for(Book book : books){
            System.out.println(book);
        }
    }

    public void sort(Comparator c){
        Collections.sort(books, c);
    }

    public void invertedSort(){
        Collections.sort(books);
    }
}
