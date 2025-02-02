package com.exercise;

public class Test {
    public static void main(String[] args) {
        // Construct an Author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // Test Author's toString()

        // Construct a Book instance
        Book dummyBook = new Book("Java for Dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook); // Test Book's toString()

        // Test getters and setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor()); // Test Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        // Use an anonymous instance of Author to construct another Book
        Book anotherBook = new Book("More Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook); // Test Book's toString()
    }
}
