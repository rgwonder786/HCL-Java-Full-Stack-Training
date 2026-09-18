//Copy Constructor in Java
public class a36 {

    int age;
    String name;

    a36(int a, String n) {
        age = a;
        name = n;
    }

    void display() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {

        a36 obj1 = new a36(10, "Rajesh");
        obj1.display();
        a36 obj2 = obj1;
        System.out.println("Object 2 Name: " + obj2.name + " " + "Age is: " + obj2.age);
    }
}
