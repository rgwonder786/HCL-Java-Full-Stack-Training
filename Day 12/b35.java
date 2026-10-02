//Terminal Operation: findFirst() 

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class b35 {

    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(12, 13, 14, 15, 16, 17);

        Optional<Integer> result = lst.stream()
                .filter(n -> n > 15)
                .findFirst();

        System.out.println(result.orElse(-1));
    }
}
