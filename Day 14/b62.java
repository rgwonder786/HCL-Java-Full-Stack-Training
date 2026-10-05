//Customized Date

import java.time.LocalDate;

public class b62 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now.getDayOfMonth();
        now.getDayOfWeek();
        now.getDayOfYear();
        System.out.println(now);
        // For Customised Date
        LocalDate customDate = LocalDate.of(1989, 04, 24);
        System.out.println(customDate);
        // For Cuurent Date - Process 2
        LocalDate today = LocalDate.now();
        System.out.println(today);
        // For Yesterday
        LocalDate Yesterday = today.minusDays(1);
        System.out.println(Yesterday);
        // For Last Month
        LocalDate LastMonth = today.minusMonths(1);
        System.out.println(LastMonth);
        // For Last Year
        LocalDate LastYear = today.minusYears(1);
        System.out.println(LastYear);
    }
}