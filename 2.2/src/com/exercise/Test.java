package com.exercise;

public class Test {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // Test Book's toString()

        // Test Getters
        System.out.println("Book name: " + javaDummy.getName());
        System.out.println("Book price: " + javaDummy.getPrice());
        System.out.println("Book quantity: " + javaDummy.getQty());

        // Test Authors
        Author[] bookAuthors = javaDummy.getAuthors();
        System.out.println("Authors:");
        for (Author author : bookAuthors) {
            System.out.println(author); // Author's toString()
        }

        // Test setting price and quantity
        javaDummy.setPrice(29.95);
        javaDummy.setQty(88);
        System.out.println("Updated price: " + javaDummy.getPrice());
        System.out.println("Updated quantity: " + javaDummy.getQty());
    }
}

