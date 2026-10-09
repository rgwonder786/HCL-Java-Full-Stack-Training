
//Record with Collections
import java.util.*;

record Student(int id, String name) {
}

public class b100 {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student(101, "Rahul"),
                new Student(102, "Amit"),
                new Student(103, "Priya"));

        for (Student s : students) {
            System.out.println(s.id() + " " + s.name());
        }
    }
}