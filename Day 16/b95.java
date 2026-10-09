//Complete Student Report Example/*
/* 
Records + Pattern Matching
These features become especially powerful when combined.
*/
public class b95 {

    public static void main(String[] args) {

        String name = "Rahul";
        int marks = 85;
        String course = "Java";

        String report = """
                ==========================
                   STUDENT REPORT
                ==========================
                Name   : %s
                Course : %s
                Marks  : %d
                Result : PASS
                ==========================
                """.formatted(name, course, marks);

        System.out.println(report);
    }
}