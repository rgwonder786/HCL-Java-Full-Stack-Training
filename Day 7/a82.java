//2. LinkedList

import java.util.LinkedList;

public class a82 {

    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.add("Jaipur");
        cities.add("Delhi");
        cities.add("Mumbai");

        cities.addFirst("Kolkata");
        cities.addLast("Pune");

        System.out.println(cities);

        cities.removeFirst();
        cities.removeLast();

        System.out.println(cities);
    }

}
