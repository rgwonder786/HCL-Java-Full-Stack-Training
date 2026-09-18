/*
2. Parameterized Constructor
A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class with our own values, then use a parameterized constructor.
*/
public class a35 {
    int rollno;
    String name;

    a35(int r, String n) {
        rollno = r;
        name = n;
    }

    public void display() {

        System.err.println("Roll No. " + rollno);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        a35 obj1 = new a35(100, "Rahul");
        a35 obj2 = new a35(102, "Raj");

        obj1.display();
        obj2.display();
    }
}
