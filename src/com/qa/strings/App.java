package com.qa.strings;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        String example = "HELLO world";
        String lowercaseExample = example.toLowerCase(Locale.ENGLISH);
        System.out.println(example);
        System.out.println(lowercaseExample);

        // get the position of the first occurence of some characters
        int indexOfWorld = example.indexOf("world"); // 6
        System.out.println(indexOfWorld);
        // we can use charAt() to get a character at a specific position in a string
        char letterAtIndex6 = example.charAt(indexOfWorld);
        System.out.println(letterAtIndex6);

        // we can get a substring with both a start and end index (exclusive)
        String world = example.substring(indexOfWorld, example.length());
        System.out.println(world);

        // if we want everything after some starting index, we can just omit the second argument
        String world2 = example.substring(indexOfWorld); // start index = 6
        System.out.println(world2);

        // we can use split to break a string into its constituent parts using some pattern (regex)
        System.out.println("== split() ==");
        String[] parts = example.split(" ");
        for (String part : parts) {
            System.out.println(part);
        }

        // startsWith, endsWith and contains
        System.out.println(example + " ends with world: " + example.endsWith("world"));
        System.out.println(example + " starts with bob: " + example.startsWith("bob"));
        System.out.println(example + " contains the letter o: " + example.contains("o"));

        // compareTo()
        // - returns one of three values
        //   -1 means the string the method was called on is smaller than the input to the method
        //    0 means the string the method was called on is the same as the input to the method
        //    1 means the string the method was called on is larger than the input to the method
        String a = "a";
        String b = "b";
        String c = "c";

        System.out.println("A LARGER THAN B? " + a.compareTo(b)); // -1 means a is smaller than b
        System.out.println("B LARGER THAN A? " + b.compareTo(a)); // 1 means b is larger than a
        System.out.println("C LARGER THAN B? " + c.compareTo(b)); // 1 means c is larger than b
        System.out.println("A SAME AS A? " + a.compareTo(a)); // 0 means a is the same as a

        String something = "Foo Bar Foo Bar";
        if (something.contains("Foo Bar")) {
            String replaced = something.replaceFirst("Foo", "Bar");
            System.out.println(replaced);
        }
    }
}
