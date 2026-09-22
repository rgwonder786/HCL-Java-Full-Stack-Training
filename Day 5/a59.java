//1. Compile-Time Polymorphism — Method Overloading
class calculator {
    int add(int a, int b) { // Method 1
        return a + b;
    }

    int add(int a, int b, int c) { // Method 2
        return a + b + c;
    }

    double add(double a, double b) { // Method 3
        return a + b;
    }
}

public class a59 {

    public static void main(String[] args) {

        calculator obj = new calculator();
        System.out.println(obj.add(40, 50));
        System.out.println(obj.add(30, 20, 50));
        System.out.println(obj.add(10.55, 30.22));
    }
}
