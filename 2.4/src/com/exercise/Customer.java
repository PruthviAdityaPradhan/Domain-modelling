package com.exercise;

public class Customer {
    private int id;
    private String name;
    private int discount;

    // Constructor
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    // Setters
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // toString method
    public String toString() {
        return name + " (" + id + ") (" + discount + "%)";
    }
}
