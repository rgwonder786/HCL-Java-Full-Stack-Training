//Default Access Modifier
class Car {
    String model; // default access
}

public class a51 {
    public static void main(String[] args) {

        Car c = new Car();
        c.model = "Tesla"; // accessible within the same package
        System.out.println(c.model);
    }
}
