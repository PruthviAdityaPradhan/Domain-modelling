package com.exercise;

public class Test {
    public static void main(String[] args) {
        // Test the Circle class
        Circle circle = new Circle(3.0, "blue");
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.getArea());
        System.out.println();

        // Test the default Cylinder constructor
        Cylinder defaultCylinder = new Cylinder();
        System.out.println("Default Cylinder:");
        System.out.println("Radius: " + defaultCylinder.getRadius());
        System.out.println("Color: " + defaultCylinder.getColor());
        System.out.println("Height: " + defaultCylinder.getHeight());
        System.out.println("Volume: " + defaultCylinder.getVolume());
        System.out.println();

    }
}
