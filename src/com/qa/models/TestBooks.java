package com.qa.models;

public class TestBooks {

    public static void main(String[] args) {
//        Book[] books = new Book[3];
//
//        Book book1 = new Book("Headfirst design patterns, 2nd ed.", "C", 2000);
//        Book book2 = new Book("Test", "T", 300);
//        System.out.println(book1.getName()
//                + " was written by "
//                + book1.getAuthor());
//        System.out.println(book1);
//
//        books[0] = book1;
//        books[1] = book2;
//
//        for (int i = 0; i < books.length; i++) {
//            System.out.println(books[i]);
//        }
        // Creating an object/instance from a class is also
        // known as instantiating
        Vehicle honda;
        honda = new Car();
//        honda.manufacturer = "Honda";
//        honda.setManufacturer("Honda");
        // Subtype polymorphism
        Vehicle mazda = new Car("Mazda", 25_333);
        Vehicle bicycle = new Bike();
//        bicycle.pedal();

        honda.updateMileage(20);
        honda.updateMileage(Integer.MAX_VALUE);
        System.out.println(honda.getMileage());

        // We want our vehicles to track their mileage
        // - they all start at 0 when created
        // - we need a method for updating the mileage
        // - a method for getting the current mileage

        System.out.println(honda);
        System.out.println(mazda);

        String info = honda.toString();
        System.out.println(info);

        acceptVehicleDelivery(bicycle);
        acceptVehicleDelivery(mazda);
    }

    static void acceptVehicleDelivery(Vehicle vehicle) {
        vehicle.drive();
    }

}
