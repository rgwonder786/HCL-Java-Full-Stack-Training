//To implement an interface we use the keyword “implements” with class
// To implement an interface we use the keyword "implements" with a class

interface Shape {

    // Abstract method
    double calculateArea();
}

// Implement the interface in Circle

class Circle implements Shape {

    private double r;

    // Constructor
    public Circle(double r) {
        this.r = r;
    }

    // Implementing the abstract method
    public double calculateArea() {
        return Math.PI * r * r;
    }
}

// Implement the interface in Rectangle

class Rectangle implements Shape {

    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    public double calculateArea() {
        return length * width;
    }
}

public class a64 {

    public static void main(String[] args) {

        // Interface reference
        Shape cir = new Circle(5.0);
        Shape rect = new Rectangle(4.0, 6.0);

        // Dynamic method dispatch
        System.out.println("Area of Circle: " + cir.calculateArea());
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}