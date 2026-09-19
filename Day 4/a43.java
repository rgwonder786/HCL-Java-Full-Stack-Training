//This to pass the current class instance as a parameter to the constructor
public class a43 {

    int rollNo;
    String name;

    a43(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display(a43 obj) {
        System.out.println("Roll No: " + obj.rollNo);
        System.out.println("Name: " + obj.name);
    }

    void show() {
        display(this); // Passing current object as parameter
    }

    public static void main(String[] args) {

        a43 student = new a43(101, "Rahul");

        student.show();
    }
}