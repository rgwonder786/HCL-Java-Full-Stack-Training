/*
21. Comparable
Comparable is used when a class has a natural/default ordering.
*/

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    // The Student class is telling Java that Student objects can be compared with
    // each other.
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    // Compare students according to their id.
    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class a93 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        // Objects are added to ArrayList
        students.add(new Student(103, "Neha"));
        students.add(new Student(101, "Rahul"));
        students.add(new Student(102, "Amit"));
        students.add(new Student(104, "S_Khan"));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
