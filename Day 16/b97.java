/*
Record Is Not Just a Data Structure
A record is actually a special class.
*/
public class b97 {

    record Student(int id, String name, double marks) {

        public boolean isPassed() {
            return marks >= 40;
        }
    }

    public static void main(String[] args) {

        Student s = new Student(101, "Rahul", 85);

        System.out.println(s.name());
        System.out.println(s.isPassed());
    }
}