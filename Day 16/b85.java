
// /var Requires an Initializer
import java.util.*;

public class b85 {

    public static void main(String[] args) {
        // var name; -> Not Allowed
        var name = "Hari";
        // var Cannot Be Initialized with null
        // var age = null;

        // Hashmap without Var
        Map<Integer, String> students = new HashMap<Integer, String>();
        students.put(10, "Rahul");
        System.out.println(students);

        // Hashmap with Var
        // var students = new HashMap<Integer, String>();

        // var With generics collection
        var List = new ArrayList<String>();
        List.add("Rakesh");
        List.get(0);

    }
}
