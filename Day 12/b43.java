//Collectors.toMap() //Used to convert Stream elements into a Map.
import java.util.*;
import java.util.stream.Collectors;
public class b43 {
     
          public static void main(String[] args) {

        List<String> names =
            Arrays.asList("Rahul", "Amit", "Neha");

        Map<String, Integer> result =
            names.stream()
                 .collect(Collectors.toMap(
                     name -> name,
                     name -> name.length()
                 ));

        System.out.println(result);
    }
}
