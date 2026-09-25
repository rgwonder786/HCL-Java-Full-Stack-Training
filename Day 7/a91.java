/*
18. Map Iteration
*/

import java.util.HashMap;
import java.util.Map;

public class a91 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Neha");
        // Method 1 — Iterate through keys
        for (Integer key : students.keySet()) {
            System.out.println(key);
        }
        // Method 2 — Iterate through values
        for (String value : students.values()) {
            System.out.println(value);
        }
        // Method 3 — Iterate through key-value pairs
        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(
                    entry.getKey() + " = " + entry.getValue());
        }
    }
}
