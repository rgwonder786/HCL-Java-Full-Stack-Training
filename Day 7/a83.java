//A Set is a collection that does not allow duplicate elements.
/*
5. HashSet

HashSet:
Does not allow duplicates
Does not guarantee sorted order
Provides efficient average-case lookup
Uses hashing internally
*/

import java.util.HashSet;

public class a83 {

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);

        System.out.println(numbers);

        System.out.println("Contains 20: "
                + numbers.contains(20));
    }
}
