package com.qa.functional_programming;

import java.util.*;

@FunctionalInterface
interface MenuAction {
    void perform();

}

public class REPLExample {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MenuAction exitAction = () -> {
            System.out.println("Goodbye!");
            System.exit(0);
        };
        MenuAction addAction = () -> {
            int num1 = getInt("NUM1: ");
            int num2 = getInt("NUM2: ");
            System.out.println("RESULT OF '" + num1 + "' + '" + num2 + "' is '" + (num1 + num2) + "'");
        };
        MenuAction subtractAction = () -> {
            int num1 = getInt("NUM1: ");
            int num2 = getInt("NUM2: ");
            System.out.println("RESULT OF '" + num1 + "' - '" + num2 + "' is '" + (num1 - num2) + "'");
        };

        MenuAction invalidAction = () -> System.out.println("That was not a valid action.");

        Map<String, MenuAction> menu = new LinkedHashMap<>(); // LinkedHashMap to retain the insertion order
        menu.put("+", addAction);
        menu.put("-", subtractAction);
        menu.put("EXIT", exitAction);

        while (true) {
            printMenu(menu.keySet());
            String input = getString("> ");
            MenuAction action = menu.getOrDefault(input.toUpperCase(), invalidAction);
            action.perform();
        }
    }

    public static void printMenu(Collection<String> menuItems) {
        System.out.println("== MAIN MENU ==");
        // forEach is a special method which accepts a Consumer<T>
        // - a lambda which accepts one input and returns nothing
        // - .forEach is available on all Collection classes
        menuItems.forEach(item -> System.out.println(item));
        System.out.println();
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static int getInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int input = sc.nextInt();
                return input;
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }
}

