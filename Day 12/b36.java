//Terminal Operation: findAny()

//import java.util.ArrayList;
import java.util.*;
public class b36 {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(12,15,17,19,21);

        Optional<Integer> findany = numbers.stream()
        .filter(n->n>15)
        .findAny();

        System.out.println(findany.orElse(-1));


    }
}
