package com.exercise;

public class Book {
    // Private instance variables
    private String name;
    private Author[] authors; // Array of authors
    private double price;
    private int qty = 0; // Default value

    // Constructor with 3 parameters
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    // Constructor with 4 parameters
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // toString method
    public String toString() {
        StringBuilder authorsString = new StringBuilder();
        authorsString.append("{");
        for (int i = 0; i < authors.length; i++) {
            authorsString.append(authors[i].toString());
            if (i < authors.length - 1) {
                authorsString.append(", ");
            }
        }
        authorsString.append("}");
        return "Book[name=" + name + ",authors=" + authorsString + ",price=" + price + ",qty=" + qty + "]";
    }
}

