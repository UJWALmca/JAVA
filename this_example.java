// Creating the Person class
class Person {
    // Instance variables
    String name;
    int age;

    // Constructor with parameters
    Person(String name, int age) {
        // Using "this()" to call another constructor
        this(); // This line calls the empty constructor below
        this.name = name;
        this.age = age;
    }

    // Empty constructor (without parameters)
    Person() {
        // This constructor doesn't do anything, but it helps set up the object
    }

    // Method to display person's details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating a person object using the constructor with parameters
        Person person1 = new Person("Alice", 30);

        // Creating another person object using the constructor with parameters
        Person person2 = new Person("Bob", 25);

        // Displaying details of both persons
        person1.displayDetails();
        person2.displayDetails();
    }
}

