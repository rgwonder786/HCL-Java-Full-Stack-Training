// Method Overloading
class calculation {
    int calc(int a, int b) {
        return a + b;
    }

    int calc(int a, int b, int c) {
        return a + b + c;
    }

    double calc(double a, double b) {
        return a * b;
    }
}

public class a65 {

    public static void main(String[] args) {
        calculation obj = new calculation();
        System.out.println(obj.calc(2, 4));
        System.out.println(obj.calc(2, 33, 44));
        System.out.println(obj.calc(22.33, 33.34));
    }

}
