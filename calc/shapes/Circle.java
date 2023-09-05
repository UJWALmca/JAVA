package shapes;
public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
    	return 3.142 * this.radius * this.radius;
        
    }
}