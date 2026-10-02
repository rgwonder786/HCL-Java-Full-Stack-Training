// Terminal Operation: noneMatch()
import java.util.*;
public class b39 {
    
    public static void main(String[] args) {
        
        List<Integer> numbers =
            Arrays.asList(10, 20, 30, 40);

        boolean result =
            numbers.stream()
                   .noneMatch(n -> n < 0);

        System.out.println(result);
    }
}
