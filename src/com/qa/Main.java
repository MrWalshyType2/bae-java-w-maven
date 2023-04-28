package com.qa;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle("rect1", "blue", 10, 10, 20, 20);
        System.out.println(rect);
        System.out.println(rect.isSquare());
        System.out.println(rect.getArea());
        System.out.println(rect.getCentrePoint());
    }
}