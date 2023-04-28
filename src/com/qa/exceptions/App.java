package com.qa.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BadCalc calculator = new BadCalc();
        System.out.println(calculator.mult(10, 20));
        System.out.println(calculator.div(10, 10));
        try {
            System.out.println(calculator.div(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());
        }
    }


    static void validateName(String name) throws InvalidNameException {
        if (name == null) throw new InvalidNameException("Name cannot be null");
        if (name.length() == 0) throw new InvalidNameException("Name must be at least 1 charcter");
    }
}

class InvalidNameException extends RuntimeException {
    public InvalidNameException(String message) {
        super(message);
    }
}