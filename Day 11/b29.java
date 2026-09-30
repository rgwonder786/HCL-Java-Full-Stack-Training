//9. limit() + skip() – Select Part of a Stream

import java.util.*;
import java.util.stream.Collectors;

public class b29 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(
                10, 20, 30, 40, 50, 60, 70);

        List<Integer> result = numbers.stream()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
/*
 * [10, 20, 30, 40, 50, 60, 70]
 * ↓
 * skip(2)
 * ↓
 * [30, 40, 50, 60, 70]
 * ↓
 * limit(3)
 * ↓
 * [30, 40, 50]
 */