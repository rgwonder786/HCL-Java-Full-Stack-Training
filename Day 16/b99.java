//Record with equals()
record Student(int id, String name) {
}

public class b99 {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(101, "Rahul");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}