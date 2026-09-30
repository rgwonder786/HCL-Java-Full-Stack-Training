
//7. distinct() + sorted() – Unique Sorted Values
import java.util.*;
import java.util.stream.Collectors;

public class b27 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(
                30, 10, 20, 30, 40, 10, 50, 20);  

        List<Integer> result = numbers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
