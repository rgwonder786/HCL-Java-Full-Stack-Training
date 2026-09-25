//Generics Example 1
/*
Problems:

Type casting is required.
Wrong data types can be inserted.
Errors may occur at runtime.
*/

import java.util.ArrayList;

public class a95 {

    public static void main(String[] args) {

        String[] arr = new String[3];
        // arr[0] = 111;
        // arr[1] = 112;
        // arr[2] = 114;
        // System.out.println(arr[1]);

        ArrayList<Object> lst = new ArrayList<>();
        lst.add("Rahul");
        lst.add("abc");
        lst.add(1);
        System.out.println(lst);
        System.out.println(lst.get(0));
        System.out.println(lst.contains("Rahul"));
        System.out.println(lst.getFirst());
        System.out.println("For Last Element: " + lst.getLast());
        arr[0] = (String) lst.getFirst();
        System.out.println(arr[0]);
        arr[1] = (String) lst.get(1);
        System.out.println(arr[1]);
    }
}
