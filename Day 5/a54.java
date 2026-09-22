// 1. Single Inheritance
class Vehicle { // Super class
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Subclass
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

public class a54 {
    public static void main(String[] args) {

        // Creating object of subclass invokes base class constructor
        new Car();
    }
}
