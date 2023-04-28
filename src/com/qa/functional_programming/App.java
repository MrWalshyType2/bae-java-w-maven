package com.qa.functional_programming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface Action {
    void perform();
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }

    // a recursive function is just a function that calls itself
    static void recursiveLoop(int current) {
        // recursive functions have a 'base case' which represents when the function should stop calling itself
        if (current == 1100000) return;
        else {
            System.out.println(current);
            recursiveLoop(current + 1);
        }
    }

    static void predicateExample() {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isOdd = num -> num % 2 == 1;
        System.out.println(isEven.test(20));

        List<Integer> numbers = List.of(1,2,3,4,5,6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());
        List<Integer> oddNumbers = numbers.stream()
                .filter(isOdd)
                .collect(Collectors.toList());
    }
    static void mapWithStringToFunctionMapping() {
        Map<String, Action> actions = new HashMap<>();
        actions.put("+", () -> {
            System.out.print("NUM1: ");
            int num1 = Integer.valueOf(sc.nextLine());
            System.out.print("NUM2: ");
            int num2 = Integer.valueOf(sc.nextLine());
            System.out.println("RESULT OF '" + num1 + "' + '" + num2 + "' is '" + (num1 + num2) + "'");
        });
        actions.put("-", () -> {
            System.out.print("NUM1: ");
            int num1 = Integer.valueOf(sc.nextLine());
            System.out.print("NUM2: ");
            int num2 = Integer.valueOf(sc.nextLine());
            System.out.println("RESULT OF '" + num1 + "' - '" + num2 + "' is '" + (num1 - num2) + "'");
        });

        System.out.println("ENTER AN ACTION (+ or -):");
        String input = sc.nextLine();
        Action action = actions.getOrDefault(input, () -> System.out.println("That was not a valid action."));
        action.perform();
    }

}
