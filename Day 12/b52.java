
//Collectors.joining()
import java.util.*;
import java.util.stream.Collectors;

public class b52 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Rahul", "Amit", "Neha");

        String result = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}