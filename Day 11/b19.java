//Stream Class Example 2

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class b19 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(12, 14, 15, 27));
        Stream<Integer> s = list.stream();
        s = s.filter(x -> x > 10);
        s = s.map(x -> x * 5);
        // s.toList();
        s.forEach(System.out::println);
    }
}
