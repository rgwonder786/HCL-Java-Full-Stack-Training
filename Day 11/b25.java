
//5. flatMap() + distinct() – Remove Duplicates
import java.util.*;
import java.util.stream.Collectors;

public class b25 {
    public static void main(String[] args) {

        List<List<String>> listOfLists = List.of(
                List.of("Java", "Python"),
                List.of("C++", "Java"),
                List.of("Python", "SQL"));

        List<String> result = listOfLists.stream()
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}