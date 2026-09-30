//2. map() – Convert Names to Uppercase

import java.util.*;
//import java.util.ArrayList;
import java.util.stream.Collectors;

public class b22 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Rahul", "Raja", "Rohit", "Ramesh"));
        List<String> result = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
