//Collecting into List

import java.util.*;
import java.util.stream.Collectors;

public class b49 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        List<Integer> result = numbers.stream()
                .filter(n -> n > 25)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}