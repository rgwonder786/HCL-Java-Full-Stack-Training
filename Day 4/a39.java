//This Keyword Example 2
class other {
    int rollno;
    String name;

    other(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println("The Name is : " + name);
        System.out.println("The Roll No is: " + rollno);
    }
}

public class a39 {

    public static void main(String[] args) {
        other obj = new other(101, "Rahul");
        obj.display();
    }
}
