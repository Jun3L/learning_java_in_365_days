package Day18;

public class Student {
    static int counter = 0; // static variable to keep track of number of Student objects created
    String name; // instance variable for student name

    Student(String name) { // constructor
        this.name = name;
        counter++; // increment counter each time a new Student object is created
    }
    static void displayCount() { // static method to display the count of Student objects
        System.out.println("Total number of students: " + counter);
    }
}
