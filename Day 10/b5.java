import java.util.function.*;
import java.util.*;

public class b5 {
    public static void main(String[] args) {
        Function<Integer, Integer> square = (n) -> n * n;
        // System.out.println("Square of 5: " + square.apply(5));

        Consumer<Integer> print = x -> System.out.println(x);
        // print.accept(7);

        // Supplier
        Supplier<Double> randomValue = () -> Math.random();
        // System.out.println(randomValue.get());

        Predicate<Integer> isEven = x -> x % 2 == 0;
        // System.out.println(isEven.test(8));

        // Iterator
        List<Integer> lst = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));

        // for (Integer i : lst) {
        // System.out.println(i);
        // }
        List<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(5);
        lst1.forEach(x -> System.out.println(x));

        

    }
}
