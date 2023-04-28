package com.qa;

// Rectangle is a concrete class
// - concrete class just refers to a class that you can
//   actually create objects from
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String name, String colour, double x, double y, double width, double height) {
        super(name, colour, x, y);
        this.width = width;
        this.height = height;
    }

    public boolean isSquare() {
        return width == height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public Point getCentrePoint() {
        double xPosition = getX() + (width / 2);
        return new Point(xPosition, getY() + (height / 2));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
