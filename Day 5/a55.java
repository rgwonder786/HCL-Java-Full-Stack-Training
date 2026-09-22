//2. Multilevel Inheritance
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}

class Car extends FourWheeler {
    Car() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}

public class a55 {
    public static void main(String[] args) {
        new Car(); // Triggers all constructors in order
    }

}
