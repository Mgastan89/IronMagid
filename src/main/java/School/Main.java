package org.example;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John Doe", 50000);
        Course course = new Course("Python 101", 200);
        Student student = new Student("Alice Smith", "123 Main St", "alice@example.com");

        // Accessing and printing the initial values
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());


    }
}