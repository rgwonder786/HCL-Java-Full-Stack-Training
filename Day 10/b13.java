/*
2. Function<T, R>
Purpose: Function is used when you want to take an input and produce a result.
Takes one input
Returns one output
Main method: apply()
*/

import java.util.function.Function;

public class b13 {
    public static void main(String[] args) {

        Function<Integer, Integer> square = number -> number * number;

        System.out.println(square.apply(5));
        System.out.println(square.apply(10));
    }
}
