// Terminal Operation: reduce()
import java.util.*;
public class b40 {
    
    public static void main(String[] args) {
         List<Integer> numbers =
            Arrays.asList(10, 20, 30, 40);

        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);

        System.out.println("Sum = " + sum);
    }
}
