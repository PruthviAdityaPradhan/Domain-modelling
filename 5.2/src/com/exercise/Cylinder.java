package com.exercise;

public class Cylinder {
    private Circle base;  // Composition: Cylinder "has-a" Circle
    private double height;

    // Constructor with default values
    public Cylinder() {
        base = new Circle(); // Default Circle
        height = 1.0;        // Default height
    }

    // Constructor with parameters for radius, color, and height
    public Cylinder(double radius, String color, double height) {
        base = new Circle(radius, color); // Construct base Circle with given radius and color
        this.height = height;
    }

    // Getters and Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public String getColor() {
        return base.getColor();
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    // Method to calculate volume of the cylinder
    public double getVolume() {
        return base.getArea() * height;
    }
}

