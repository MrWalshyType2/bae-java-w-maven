package com.qa.models;

public class Car extends Vehicle {

    public Car() {
//        super(); // call the parent classes constructor
    }

    public Car(String manufacturer, int mileage) {
        super(manufacturer, mileage);
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}