//3. Lambda for Addition
@FunctionalInterface
interface calculate {
    void demo(int a, int b);
}

public class b9 {

    public static void main(String[] args) {

        calculate c1 = (int a, int b) -> System.out.println(a + b);
        c1.demo(5, 6);
    }
}
