package com.qa.interfaces;

public class App {

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.log("TRIANGLE HERE");

        Hexagon h = new Hexagon();
        h.log("HEXAGON HERE");
    }
}

class Triangle implements TimeLoggable { }
class Hexagon implements ConsoleLoggable, TimeLoggable {
    @Override
    public void log(String input) {
        TimeLoggable.super.log(input);
    }
}