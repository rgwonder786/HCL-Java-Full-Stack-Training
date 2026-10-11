//Immutable Class // Immutable Code
public class b110 {

    public static void main(String[] args) {
        College college = new College("Poornima Univ.", "Sitapura");
        Student s1 = new Student(26, "Rahul", college);
        s1.showCollege().name = "Arya College";
        System.out
                .println(s1.showName() + "'s age is: " + s1.showAge() + " & his college is: " + s1.showCollege().name);
    }
}

// Immnutable Class & Object

final class Student {
    private final int age; // Immutable Data Type Declaration
    private final String name; // Immutable Data Type Declaration
    private final College college;

    // Declaration of Constructor
    // Defensive Copy
    Student(int age, String name, College college) {
        this.age = age;
        this.name = name;
        // this.college = college;
        this.college = new College(college.name, college.address);
    }

    // Setter
    public int showAge() {
        return this.age;
    }

    public String showName() {
        return this.name;
    }

    public College showCollege() {
        // return this.college;
        return new College(this.college.name, this.college.address);
    }
}

class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}