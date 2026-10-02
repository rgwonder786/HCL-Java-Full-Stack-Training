import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Stream;
//import java.util.*;

public class b48 {

    public static void main(String[] args) {

        List<Integer> obj1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        // Sequential Stream
        // obj1.stream()
        // .filter(s -> s % 2 == 0)
        // .map(s -> s * 2) // Stateless
        // // .sorted() // Statefull
        // .forEach(System.out::println);

        obj1.parallelStream()
                .filter(s -> s % 2 == 0)
                .map(s -> s * 2) // Stateless
                // .sorted() // Statefull
                // .forEach(System.out::println);
                .forEachOrdered(System.out::println);

    }
}
