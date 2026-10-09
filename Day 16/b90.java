//Multiple Switch Case
public class b90 {

    public static void main(String[] args) {
        int day = 6;

        String type = switch (day) {

            case 1, 2, 3, 4, 5 -> "Weekday";

            case 6, 7 -> "Weekend";

            default -> "Invalid";
        };

        System.out.println(type);
    }
}
