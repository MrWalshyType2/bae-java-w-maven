package com.qa.models;

public abstract class Vehicle {

    // Fields store data
    private String manufacturer; // null
    private int mileage; // 0

    public Vehicle() {
        // default constructor replacement
        this("UNKNOWN", 0);
    }

    public Vehicle(String manufacturer, int mileage) {
        this.manufacturer = manufacturer;
        this.mileage = mileage;
    }

    public abstract void drive();

    public void updateMileage(int mileage) {
        this.mileage += mileage;
    }

    public int getMileage() {
        return this.mileage;
    }

    // Methods which act upon that data
    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        // null check
        if (manufacturer != null) {
            this.manufacturer = manufacturer;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
