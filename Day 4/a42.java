//pass the current class instance as a parameter to the method.
public class a42 {

    void m1() {
        m2(this); // This keyword can work as argument
        System.out.println("1st Method Printed");
    }

    void m2(a42 s) { // Can also call method as parameter
        System.out.println("2nd Method Printed " + s);
    }

    public static void main(String[] args) {

        a42 obj = new a42();
        obj.m1();
    }
}

// o/p - a42@4517d9a3 as reference of object