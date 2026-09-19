//This keyword It is used to return the current class instance from the method.

public class a44 {

    void m1() {
        System.out.println("Print the Function");
    }

    String m2() {
        System.out.println("Prints String Value");
        return "Deepak";
    }

    a44 m3() { // Returns current class reference
        System.out.println("Return m3");
        return this;
    }

    public static void main(String[] args) {

        a44 obj = new a44();
        System.out.println(obj.m3());
    }
}
