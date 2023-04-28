package com.qa.interface_example;

public class FileInputReader implements InputReadable {
    @Override
    public String readLine() {
        System.out.println("Reading line from file");
        return "line";
    }
}
