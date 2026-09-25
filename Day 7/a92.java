
//Removing Elements During Iteration
import java.util.HashMap;
import java.util.*;

public class a92 {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Neha");

        System.out.println("Before Removal:");
        System.out.println(students);

        // Iterator over keys
        Iterator<Integer> itr = students.keySet().iterator();

        while (itr.hasNext()) {

            Integer key = itr.next();

            if (key == 102) {
                itr.remove();
            }
        }

        System.out.println("After Removal:");
        System.out.println(students);
    }
}
