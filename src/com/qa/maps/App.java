package com.qa.maps;

import java.util.*;

public class App {
    public static void main(String[] args) {
        /*
            Maps are key:value pairs.
            - library is an example of key:value pairs, we have book titles that map to a book value
            - contacts name:number
         */
        // Declared a Map variable with keys of type String and values of type Book
        Map<String, Book> library;

        // Initialise the Map variable with an implementation
        library = new HashMap<>();

        // add items to the map
        library.put("Head First Design patterns", new Book("HFDP", 2000));
        library.put("Test", new Book("Test", 5000));
        library.put("Test1", new Book("Test", 5000));
        library.put("Test2", new Book("Test", 5000));
        library.put("Test3", new Book("Test", 5000));

        // get an item by its key
        Book testBook = library.get("Test");
        System.out.println(testBook);

        // get an item that might not exist
        // we could specify a default for if it doesn't exist
        Book doesNotExist = library.getOrDefault("fjoisad", new Book("DEFAULT", 00));

        // Sets are unique with no duplicates in them
        // - there is no natural order by default
        Set<String> keys = library.keySet();

        // we can get an iterator from the set
        Iterator<String> iterator = keys.iterator();

        // check if there is a next item
        while (iterator.hasNext()) {
            // get the current item
            String key = iterator.next(); // next advances the iterator
            System.out.println(key);
        }

    }

}
