//Lambda 1
interface Greeting {
    void sayHello();
}

public class b6 {

    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello");
        g.sayHello();
    }
}
/*
 * () → no parameters
 * -> → lambda operator
 * System.out.println(...) → implementation of sayHello()
 */