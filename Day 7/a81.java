//ArrayList : ArrayList is backed internally by a resizable array.

import java.util.ArrayList;

public class a81 {
public static void main(String[] args) {
     ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Neha");
        students.add("Rahul");

        System.out.println(students);

        System.out.println("First student: " + students.get(0));

        students.set(1, "Ravi");

        students.remove("Neha");

        System.out.println("After modification: " + students);
}
}
