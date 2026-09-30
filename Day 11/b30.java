
//10. Complete Example – flatMap() + filter() + map() + distinct() + sorted() + peek()
import java.util.*;
import java.util.stream.Collectors;

public class b30 {

        public static void main(String[] args) {

                List<List<String>> listOfLists = List.of(
                                List.of("Student", "Java", "Python"),
                                List.of("Spring", "SQL", "Student"),
                                List.of("Java", "Servlet", "Spring"),
                                List.of("Security", "Python"));

                Set<String> intermediateResults = new LinkedHashSet<>();

                List<String> result = listOfLists.stream()

                                // 1. Flatten nested lists
                                .flatMap(List::stream)

                                // 2. Keep strings starting with S
                                .filter(s -> s.startsWith("S"))

                                // 3. Convert to uppercase
                                .map(String::toUpperCase)

                                // 4. Remove duplicates
                                .distinct()

                                // 5. Sort alphabetically
                                .sorted()

                                // 6. Inspect intermediate result
                                .peek(intermediateResults::add)

                                // Terminal operation
                                .collect(Collectors.toList());

                System.out.println("Intermediate Results: "
                                + intermediateResults);

                System.out.println("Final Result: "
                                + result);
        }
}