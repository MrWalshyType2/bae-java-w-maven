package com.qa.interface_example;

public class App {
    public static void main(String[] args) {
        InputReadable consoleReader = new ConsoleInputReader();
        System.out.print("> ");
        String output = consoleReader.readLine();
        System.out.println(output);

        InputReadable fileReader = new FileInputReader();
        String line = fileReader.readLine();
        System.out.println(line);

        consoleReader.foo();
        fileReader.foo();
    }
}
