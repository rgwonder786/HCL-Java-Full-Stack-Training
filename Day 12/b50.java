
//Collecting into Set
import java.util.*;
import java.util.stream.Collectors;

public class b50 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 20, 30, 30, 40);

        Set<Integer> result = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println(result);
    }
}