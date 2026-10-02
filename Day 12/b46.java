//1. Using the parallel() Method
// Java Program to demosntrate 
// the working of parallel stream
import java.util.Arrays;
import java.util.List;

public class b46 {
    public static void main(String[] args)
    {
        List<Integer> numbers
            = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Convert to parallel stream and perform operations
        numbers
            .parallelStream()
            // Filter even numbers
            .filter(n -> n % 2 == 0)
            // Print each number
            .forEach(System.out::println);
    }
}