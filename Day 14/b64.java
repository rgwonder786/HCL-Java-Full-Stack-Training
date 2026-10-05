//Local Time

import java.time.LocalTime;

public class b64 {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        // For current Hour
        System.out.println(now.getHour());
        // For Current minute
        System.out.println(now.getMinute());
        // For current Second
        System.out.println(now.getSecond());
        // For Nanosecond
        System.out.println(now.getNano());

        // Customized Time
        LocalTime CustomTime = LocalTime.of(12, 2, 23);
        System.out.println(CustomTime);

        // Parsing
        String timeString = "15:30:45";
        System.out.println(LocalTime.parse(timeString));

        // Previos Hour
        LocalTime pastTime = now.minusHours(1);
        System.out.println(pastTime);
    }
}
