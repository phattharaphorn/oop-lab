public class Triangle extends GeometricObject {

    // Attributes
    private double side;

    // Constructors
    public Triangle(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    // Methods
    public double getArea() {
        return (Math.sqrt(3) * this.side * this.side) / 4;
    }

    public double getPerimeter() {
        return this.side * 3;
    }
}