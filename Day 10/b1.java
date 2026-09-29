//Before Lambda Expression
public class b1 {

    public static void main(String[] args) {

        Calculator c = new Addition();
        int sum = c.calculate(3, 4);
        System.out.println("Sum: " + sum);
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
