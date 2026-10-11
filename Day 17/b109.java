public class b109 {
    public static void main(String[] args) {
        College col = new College("JECRC", "Jagatpura");
        Student s1 = new Student(22, "Rahul", col);
        // 2nd part
        s1.getCollege().name = "Poonima University";
        System.out.println(s1.getCollege().name);
        //System.out.println(s1);
        // System.out.println(s1.getAge());
        // System.out.println(s1.getName());
        // System.out.println(s1.getCollege());
        System.out.println("---Mutable---");
        // College col = new College("JECRC", "Shri Ram ki Nangal");
        // System.out.println(col);
        System.out.println(col.name = "JU");
    }
}

// Immutable Class
// defensive copy of college - NOn Premitive
class Student {
    private int age;
    private String name;
    private College college;

    Student(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = new College(college.name, college.Address);
    }

    // Gatters
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public College getCollege() {
        return new College(this.college.name, this.college.Address);
    }
}

// class AIstudents extends Student {

// }

class College {
    String name;
    String Address;

    College(String name, String Address) {
        this.name = name;
        this.Address = Address;
    }
}