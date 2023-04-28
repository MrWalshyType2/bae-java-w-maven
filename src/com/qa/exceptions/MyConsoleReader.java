package com.qa.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyConsoleReader {

    public static void main(String[] args) {
        MyConsoleReader reader = new MyConsoleReader();
        reader.readAndPrint();
    }

    public void readAndPrint() {
        StringBuffer sb = new StringBuffer();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("> ");
            String line = br.readLine();

            while (line.equals("stop") != true) {
                sb.append(line + "\n");
                System.out.print("> ");
                line = br.readLine();
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
