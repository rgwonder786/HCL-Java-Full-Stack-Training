//3. filter() + map() – Students Starting with S

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;;

public class b23 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Samar", "Sajid", "Hari", "Ram"));

        Stream<String> names = list.stream()
                .filter(s -> s.startsWith("S"))
                .map(String::toUpperCase);
        names.forEach(System.out::println);
    }
}
