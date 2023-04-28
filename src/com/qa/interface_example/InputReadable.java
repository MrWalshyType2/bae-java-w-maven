package com.qa.interface_example;

public interface InputReadable {
    String readLine(); // automatically public and abstract by default

    default void foo() {
        System.out.println("bar: " + this.getClass());
    }
}
