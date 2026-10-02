//Stream Cannot Normally Be Reused
//import java.util.*;
import java.util.stream.Stream;

public class b45 {

    public static void main(String[] args) {

        Stream<Integer> stream =
            Stream.of(10, 20, 30);

        stream.forEach(System.out::println);

        // Error
        stream.forEach(System.out::println);
    }
}