

import shapes.*;
import shapes.Triangle;
import shapes.Circle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Area of the Square:");
        System.out.println(square.calculateArea());

        Triangle triangle = new Triangle(6,5);
        System.out.println("Area of the Triangle:");
        System.out.println(triangle.calculateArea());

        Circle circle = new Circle(5);
        System.out.println("Area of the Circle:");
        System.out.println(circle.calculateArea());
    }
}
