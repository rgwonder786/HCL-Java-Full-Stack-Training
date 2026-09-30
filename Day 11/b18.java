
//1. Stream Class Example 1
import java.util.*;
import java.util.stream.Stream;

public class b18 {

    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>(List.of(5, 12, 7, 14));
        // lst.stream();
        Stream<Integer> s = lst.stream()
                .filter(x -> x > 10)
                .map(x -> x * 2);
        // s.toList();
        s.forEach(System.out::println);
    }

}
