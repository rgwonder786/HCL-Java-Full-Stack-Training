
/*
7. TreeSet

TreeSet stores unique elements in sorted order.
*/
import java.util.TreeSet;

public class a85 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println(numbers);
    }
}
