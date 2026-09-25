/*
6. LinkedHashSet
LinkedHashSet maintains insertion order while still preventing duplicates.
*/

import java.util.LinkedHashSet;

public class a84 {

    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Neha");
        names.add("Rahul");

        System.out.println(names);
    }
}
