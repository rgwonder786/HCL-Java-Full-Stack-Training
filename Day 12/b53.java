//groupingBy()
/*
One of the most important Collectors operations.
It groups objects according to a property.
*/

import java.util.*;
import java.util.stream.Collectors;

class Student {

    String name;
    String department;

    Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class b53 {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Rahul", "AI"),
                new Student("Amit", "CSE"),
                new Student("Neha", "AI"),
                new Student("Priya", "CSE"));

        Map<String, List<Student>> result = students.stream()
                .collect(Collectors.groupingBy(
                        s -> s.department));

        System.out.println(result);
    }
}
