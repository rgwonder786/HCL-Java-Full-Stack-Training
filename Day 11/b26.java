
//6. filter() + sorted() – Sort Numbers

import java.util.*;
import java.util.stream.Collectors;

public class b26 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(
                45, 12, 78, 23, 10, 56, 34);

        List<Integer> result = numbers.stream()
                .filter(n -> n > 20)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
