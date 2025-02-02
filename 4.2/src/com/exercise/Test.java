package com.exercise;

public class Test {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", "123 Main St");
        System.out.println(person);

        // Create a Student object
        Student student = new Student("Bob", "456 College Ave", "Computer Science", 2024, 15000.50);
        System.out.println(student);

        // Modify Student attributes
        student.setProgram("Data Science");
        student.setYear(2025);
        student.setFee(16000.75);
        System.out.println("Updated Student: " + student);

        // Create a Staff object
        Staff staff = new Staff("Charlie", "789 University Blvd", "High School", 50000.00);
        System.out.println(staff);

        // Modify Staff attributes
        staff.setSchool("Middle School");
        staff.setPay(52000.25);
        System.out.println("Updated Staff: " + staff);
    }
}
