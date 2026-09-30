//1. filter() – Filter Even Numbers

import java.util.*;
//import java.util.stream.Collector;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class b21 {

    public static void main(String[] args) {

        // List<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // System.out.println(list.get(0));

        // List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        // System.out.println(list.get(0));

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        List<Integer> s = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(s);

    }
}
