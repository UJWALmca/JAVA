package shapes;

public class Triangle {
    private int height;
    private int base;

    public Triangle(int height,int base) {
        this.height = height;
        this.base = base;
    }

    public double calculateArea() {
        return 0.5 * this.base * this.height;
    }
}