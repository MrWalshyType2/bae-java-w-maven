package com.qa.models;

public class Bike extends Vehicle {

    public void pedal() {
        System.out.println("Pedalling");
    }

    @Override
    public void drive() {
        pedal();
    }
}
