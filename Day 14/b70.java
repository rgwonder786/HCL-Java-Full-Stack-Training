//Calculate Period Between Two Dates

import java.time.LocalDate;
import java.time.Period;

public class b70 {

        public static void main(String[] args) {

                LocalDate startDate = LocalDate.of(2026, 1, 10);

                LocalDate endDate = LocalDate.of(2026, 10, 5);

                Period period = Period.between(startDate, endDate);

                System.out.println("Start Date: " + startDate);
                System.out.println("End Date: " + endDate);

                System.out.println("\nDifference:");
                System.out.println("Years  : " + period.getYears());
                System.out.println("Months : " + period.getMonths());
                System.out.println("Days   : " + period.getDays());
        }
}
