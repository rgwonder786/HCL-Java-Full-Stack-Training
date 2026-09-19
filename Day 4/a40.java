//This refers current class method
public class a40 {

    void m1() {

        System.out.println("Method M1");
        this.m2(); // m2() -> this.m2()
    }

    void m2() { // Instance of Current class - Class method

        System.out.println("Method M2");
    }

    public static void main(String[] args) {
        a40 obj = new a40();
        obj.m1();
    }
}
