//Default Constructor
/*
A default constructor has no parameters. It’s used to assign default values to an object. If no constructor is explicitly defined, Java provides a default constructor.
*/
public class a34 {

    String name;
    int age;

    public static void main(String[] args) {

        a34 obj = new a34();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
/*
Explanation: No constructor is declared in the Student class. Therefore, the compiler provides a default no-argument constructor. When new Student() is executed, that constructor is called. The instance variables receive their default values, such as null for String and 0 for int.
*/