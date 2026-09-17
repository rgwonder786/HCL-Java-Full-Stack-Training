
//  "switch" Statement in Java
// The switch statement in Java runs one block of code based on matching a condition.
// It checks multiple cases for a value and runs the matching case.
// If no case matches, the optional default block runs.
import java.util.*;

public class a16 {

    public static void main(String[] args) {

        int day;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the day no: ");
            day = sc.nextInt();
        }
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Welcome to Calender");
        }
    }
}
