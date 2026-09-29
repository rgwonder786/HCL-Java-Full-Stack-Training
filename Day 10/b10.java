//4. Lambda to Check Greatest Number
@FunctionalInterface
interface checkNumber {
    public void numcheck(int a, int b);
}

public class b10 {

    public static void main(String[] args) {

        checkNumber c2 = (int a, int b) -> System.out.println((a > b) ? a : b);
        c2.numcheck(4, 5);
    }
}
