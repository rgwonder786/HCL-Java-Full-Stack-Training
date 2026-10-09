//Records Can Implement Interfaces
interface Printable {
    void print();
}

record Student(int id, String name) implements Printable {

    @Override
    public void print() {
        System.out.println(id + " " + name);
    }
}

public class b98 {

    public static void main(String[] args) {
        Student s = new Student(101, "Rahul");
        s.print();
    }
}