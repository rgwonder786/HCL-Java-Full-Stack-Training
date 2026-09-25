//List With Generics
/*
List<String>
This gives:
Type safety
No explicit casting
Better readability
Compile-time error checking

*/

import java.util.ArrayList;
import java.util.List;

public class a96 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Rahul");
        lst.add("Raj");

        String name = lst.get(0);
        System.out.println(name);
    }
}