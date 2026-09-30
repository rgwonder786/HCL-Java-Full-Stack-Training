//4. flatMap() – Flatten Nested Lists

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.*;

public class b24 {

    public static void main(String[] args) {
        List<List<String>> listofList = new ArrayList<>(List.of(
                List.of("Java", "C++"),
                List.of("Ruby", "Perl"),
                List.of("Scala", ".Net")));

        List<String> result = listofList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
