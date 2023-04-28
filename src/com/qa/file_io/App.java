package com.qa.file_io;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        writeToFile("./helloworld.txt");
        readFile("./helloworld.txt");
        writeToFile("./other.txt");
    }

    public static void writeToFile(String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
//             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER 'STOP' TO QUIT");
            System.out.print("> ");
            String line = sc.nextLine();

            while (!line.equals("stop")) {
                bw.write(line + "\n");
                System.out.print("> ");
                line = sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File does not exist");
        } catch (IOException e) {
            System.err.println("Something went wrong trying to open the file or read from the console");
        } catch (NullPointerException e) {
            System.err.println("Did you send the EOF, CTRL-D, signal to the console?");
        }
    }
    public static void readFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.err.println("File does not exist");
        } catch (IOException e) {
            System.err.println("Something went wrong trying to open the file");
        }
    }
}
