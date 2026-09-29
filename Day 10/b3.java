
//you can use a lambda in the forEach() method of an ArrayList
import java.util.ArrayList;

public class b3 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(12);

        System.out.println("Numbers in the list: " + numbers);
        numbers.forEach((n) -> {
            System.out.println(n);
        });
    }
}
