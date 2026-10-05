//Date Formatter

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class b68 {

    public static void main(String[] args) {
        String Date = "05/10/2026";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse = LocalDate.parse(Date, dateTimeFormatter);
        System.out.println(parse);
    }
}
