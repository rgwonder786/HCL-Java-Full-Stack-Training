//5. Lambda to Check Even Number
interface checkEven {
    public void check(int a);
}

public class b11 {

    public static void main(String[] args) {

        checkEven c3 = (a) -> {
            if (a % 2 == 0) {
                System.out.println("Even No");
            } else {
                System.out.println("Odd No");
            }
        };
        c3.check(10);
        c3.check(25);

    }
}
