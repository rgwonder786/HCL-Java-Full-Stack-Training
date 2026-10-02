
//Terminal Operation: allMatch()
import java.util.*;

public class b38 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        boolean result = numbers.stream()
                .allMatch(n -> n > 0);

        System.out.println(result);
    }

}
