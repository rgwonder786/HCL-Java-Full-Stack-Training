//24. Comparator Example

import java.util.ArrayList;
import java.util.Comparator;

class Student {

    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class a94 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Neha", 85));
        students.add(new Student(101, "Rahul", 92));
        students.add(new Student(102, "Amit", 78));

        // Sort by marks
        students.sort(
                Comparator.comparingDouble(s -> s.marks));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
