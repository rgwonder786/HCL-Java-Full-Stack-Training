//Millisecond

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class b67 {

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        Instant now = Instant.now();
        Instant end = Instant.now();
        System.out.println(now);
        Duration d1 = Duration.between(now, end);
        System.out.println(d1);
        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(d2);
        System.out.println("---END---");
    }
}
