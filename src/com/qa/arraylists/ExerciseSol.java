package com.qa.arraylists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExerciseSol {
    public static void main(String[] args) {
        Vehicle mazda = new Vehicle(1997, "Mazda");
        Vehicle honda = new Vehicle(1993, "Honda");

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(mazda);
        vehicles.add(honda);

//        for (Vehicle vehicle : vehicles) {
//            System.out.println(vehicle);
//        }
        // for (i in range(0, len(vehicles)):
        for (int index = 0; index < vehicles.size();) {
            Vehicle currentVehicle = vehicles.get(index);
//            System.out.println(currentVehicle);
            vehicles.remove(currentVehicle);
        }
        System.out.println("Goodbye");
        System.out.println(vehicles);
    }
}

class Vehicle {
    private int dateManufactured;
    private String manufacturer;

    public Vehicle(int dateManufactured, String manufacturer) {
        this.dateManufactured = dateManufactured;
        this.manufacturer = manufacturer;
    }

    public int getDateManufactured() {
        return dateManufactured;
    }

    public void setDateManufactured(int dateManufactured) {
        this.dateManufactured = dateManufactured;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "dateManufactured=" + dateManufactured +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}