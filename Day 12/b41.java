//counting()
import java.util.*;
import java.util.stream.Collectors;

public class b41 {

    public static void main(String[] args) {

        List<String> names =
            Arrays.asList("A", "B", "C", "D");

        long count =
            names.stream()
                 .collect(Collectors.counting());

        System.out.println(count);
    }
}