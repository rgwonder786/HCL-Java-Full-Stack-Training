
/*
1. Predicate<T>
Purpose: Predicate is used when you want to test/check something.
Takes one input
Returns boolean
Main method: test()
*/
import java.util.function.Predicate;

public class b12 {
    public static void main(String[] args) {

        Predicate<Integer> checkEven = number -> number % 2 == 0;

        System.out.println(checkEven.test(10));
        System.out.println(checkEven.test(15));
    }
}
