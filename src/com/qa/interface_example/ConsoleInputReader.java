package com.qa.interface_example;

import java.util.Scanner;

public class ConsoleInputReader implements InputReadable {

    private Scanner scanner;

    public ConsoleInputReader() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String readLine() {
        return scanner.nextLine();
    }
}
