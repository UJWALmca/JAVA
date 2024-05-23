public class Animal { }

public class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal; // Safe casting
            myDog.bark();
        } else {
            System.out.println("Not a Dog instance");
        }
    }
}
