// Super is used to refer to the parent class constructor.
class parent3 {
    parent3() {
        super();
        System.out.println("Parent Printed");
    }
}

class child3 extends parent3 {
    child3() {
        System.out.println("Child Printed");
    }
}

public class a48 {
    public static void main(String[] args) {
        new child3();
    }
}
