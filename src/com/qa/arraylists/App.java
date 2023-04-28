package com.qa.arraylists;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // declared a List that stores Book objects
        List<Book> books;

        // initialise the list
        books = new ArrayList<>();

        Book book1 = new Book("Headfirst patterns");
        Book book2 = new Book("Art of Computer Programming");

        // add the books to the list
        books.add(book1);
        books.add(book2);

        Book[] booksArr = new Book[6];

        books.get(2);
        // get the book at the last position of the list
        Book lastBookInList = books.get(books.size() - 1);
        System.out.println(lastBookInList.name);

        // Check if a book exists in the books list
        if (books.contains(book1)) {
            System.out.println("We do have '" + book1.name + "' in stock.");
            // get the position of the book
            int indexOfBook = books.indexOf(book1);

            // if we didn't know the book was in the list, we would check to make sure that indexOf did not return -1
            // - -1 indicates the book wasn't found
            System.out.println("Book is at position: " + indexOfBook);
        }
    }

}

class Book {
    String name;

    public Book(String name) {
        this.name = name;
    }
}