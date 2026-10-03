/*Student Marks Analysis: Given a list of students and their marks, find students who scored above 60, calculate the average marks, and identify the highest scorer using Streams.
*/

import java.util.*;
import java.util.stream.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class b60 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(101, "Rahul", 75),
                new Student(102, "Amit", 55),
                new Student(103, "Priya", 92),
                new Student(104, "Neha", 68),
                new Student(105, "Vikas", 45));

        // 1. Find students scoring above 60
        List<Student> passedStudents = students.stream()
                .filter(s -> s.getMarks() > 60)
                .collect(Collectors.toList());

        System.out.println("Students scoring above 60:");
        passedStudents.forEach(System.out::println);

        // 2. Calculate average marks
        double average = students.stream()
                .mapToDouble(Student::getMarks)
                .average()
                .orElse(0.0);

        System.out.printf("Average Marks: %.2f%n", average);

        // 3. Identify the highest scorer
        Optional<Student> highestScorer = students.stream()
                .max(Comparator.comparingDouble(Student::getMarks));

        highestScorer.ifPresent(s -> System.out.println("Highest Scorer: " + s));
    }
}