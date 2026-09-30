
//Divided by 2
import java.util.ArrayList;
import java.util.List;
//import java.util.stream.*;

public class b20 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(12, 14, 15, 27));

        // Stream<Integer> s = list.stream();

        list.stream()
                .filter(x -> x > 10)
                .map(x -> x / 2)
                .forEach(System.out::println);
    }
}
