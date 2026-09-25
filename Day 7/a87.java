//HashMap 2

import java.util.HashMap;

public class a87 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println(map.get(1)); // Get Key Value

        System.out.println(map.containsKey(2));// Get Boolean value

        System.out.println(map.containsValue("Java")); // Get Boolean Value

        System.out.println(map.size());
    }
}
