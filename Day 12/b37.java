//Terminal Operation: anyMatch()
import java.util.*;
public class b37 {
    
    public static void main(String[] args) {
        
         List<Integer> numbers =
            Arrays.asList(10, 20, 35, 40);

        boolean result =
            numbers.stream()
                   .anyMatch(n -> n > 30);

        System.out.println(result);
    }
}
