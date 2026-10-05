
//Calculate Age and Date Difference
import java.time.LocalDate;
import java.time.Period;

public class b69 {

    public static void main(String[] args) {

        // Date of Birth
        LocalDate dob = LocalDate.of(1989, 4, 24);

        // Current Date
        LocalDate today = LocalDate.now();

        // Calculate Period
        Period age = Period.between(dob, today);

        System.out.println("Date of Birth: " + dob);
        System.out.println("Today: " + today);

        System.out.println("\nAge:");
        System.out.println("Years  : " + age.getYears());
        System.out.println("Months : " + age.getMonths());
        System.out.println("Days   : " + age.getDays());

        System.out.println("\nComplete Age: "
                + age.getYears() + " Years, "
                + age.getMonths() + " Months, "
                + age.getDays() + " Days");
    }
}
