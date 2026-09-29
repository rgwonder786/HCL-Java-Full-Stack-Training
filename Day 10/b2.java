public class b2 {
    public static void main(String[] args) {
        Calculator c = new Addition();
        int sum = c.calculate(3, 4);
        System.out.println("Sum: " + sum);
        print(3, 4, (a, b) -> a + b);
        // Calculator c = (a, b) -> a + b;
        // print(3, 4, c);
    }

    public static void print(int a, int b, Calculator c) {
        System.out.println(c.calculate(a, b));

    }
}

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

class Addition implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
