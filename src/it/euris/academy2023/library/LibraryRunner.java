package it.euris.academy2023.library;

import java.util.Comparator;

public class LibraryRunner {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER", "1936", "novel"));
        library.addBook(new Book("A TIME TO KILL", "JOHN GRISHAM", "1989", "novel"));
        library.addBook(new Book("THE HOUSE OF MIRTH", "EDIT WHARTON", "1905", "novel"));
        library.addBook(new Book("EAST OF EDEN", "JOHN STEINBECK", "1952", "novel"));
        library.addBook(new Book("THE SUN ALSO RISES", "ERNEST HEMINGWAY", "1926", "novel"));

        library.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                return Integer.valueOf(b1.getYear()).compareTo(Integer.valueOf(b2.getYear()));
            }
        });
        library.printAll();

        System.out.println("----------------------------");

        library.invertedSort();
        library.printAll();
    }
}
