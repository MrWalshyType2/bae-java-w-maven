package com.qa.interfaces;

public interface ConsoleLoggable extends Loggable {
    @Override
    default void log(String input) {
        System.out.println("Console Output> " + input);
    }
}
