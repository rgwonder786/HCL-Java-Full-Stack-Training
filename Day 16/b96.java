//Basic Record Syntax 1
public class b96 {

    record Student(int id, String name, double marks) {
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 85.5);

        System.out.println("ID     : " + s1.id());
        System.out.println("Name   : " + s1.name());
        System.out.println("Marks  : " + s1.marks());
    }
}