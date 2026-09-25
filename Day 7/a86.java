/*
10. HashMap

HashMap stores key-value pairs using hashing
*/

import java.util.HashMap;

public class a86 {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(101, "Raj");
        students.put(101, "Rohit");
        students.put(102, "Amit");
        students.put(103, "Neha");
        students.put(104, "Neha");
        students.put(102, "Amit");

        System.out.println(students);
        System.out.println("----------------");
        System.out.println("Student 101: "
                + students.get(101));
        System.out.println("----------------");
        System.out.println("Contains key 102: "
                + students.containsKey(102));
        System.out.println("----------------");
        students.remove(103);

        System.out.println(students);
    }
}
