//8. peek() – Inspect Intermediate Results

import java.util.*;
import java.util.stream.Collectors;

public class b28 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(5, 10, 15, 20, 25);

        List<Integer> result = numbers.stream()

                .filter(n -> n > 10)

                .peek(n -> System.out.println("After filter: " + n))

                .map(n -> n * 2)

                .peek(n -> System.out.println("After map: " + n))

                .collect(Collectors.toList());

        System.out.println("Final Result: " + result);
    }
}