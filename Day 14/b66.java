//Zoned Date Time - Coordinated Universal Time (UTC) 

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class b66 {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        Set<String> availableZoneids = ZoneId.getAvailableZoneIds();
        // System.out.println(availableZoneids);
        availableZoneids.forEach(System.out::println);

        // Customised ZonedDate Time
        // Customized ZonedDateTime
        ZonedDateTime auTime = ZonedDateTime.of(
                1989, // Year
                12, // Month
                15, // Day
                10, // Hour
                30, // Minute
                0, // Second
                0, // Nano
                ZoneId.of("Australia/Lindeman"));

        System.out.println("\nAustralia/Lindeman Time:");
        System.out.println(auTime);

        // Find Indian Time
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(indiaTime);

        // Find Australian Time
        ZonedDateTime aucurrentTime = ZonedDateTime.now(ZoneId.of("Australia/Lindeman"));
        System.out.println(aucurrentTime);
    }
}
