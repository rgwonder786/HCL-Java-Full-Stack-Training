
//Check Date with Conditions
import java.time.LocalDate;

public class b63 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate yesterday = today.minusDays(1);

        if (today.isAfter(yesterday)) {
            System.out.println("Sahi Baat");
        }
    }
}
