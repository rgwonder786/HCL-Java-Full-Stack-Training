/*
4. Private Constructor
A private constructor cannot be accessed from outside the class. It is commonly used in:

Singleton Pattern: To ensure only one instance of a class is created.
Utility/Helper Classes: To prevent instantiation of a class containing only static methods.
*/
// public class a37 {

//     private a37() {
//         System.out.println("Hello, From HCL");
//     }

//     public static void displayMsg() {
//         System.out.println("Hello, from JECRC");
//     }

//     public static void main(String[] args) {

//         a37 obj = new a37();
//         a37.displayMsg();

//     }
// }
//Copy Constructor in Java
public class a37 {

    int age;
    String name;

    private a37(int a, String n) {
        age = a;
        name = n;
    }

    void display() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {

        a37 obj1 = new a37(10, "Rajesh");
        obj1.display();
    }
}
