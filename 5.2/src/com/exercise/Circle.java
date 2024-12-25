package com.exercise;

public class Circle {
    private double radius;
    private String color;

    // Constructor with default values
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // Constructor with parameters
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }
}