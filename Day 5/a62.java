//Multiple Interfaces
interface first {
    public void display1();
}

interface second {
    public void display2();
}

class demo implements first, second {
    public void display1() {
        System.out.println("First Display");
    }

    public void display2() {
        System.out.println("Second Display");
    }
}

public class a62 {

    public static void main(String[] args) {

        demo d = new demo();
        d.display1();
        d.display2();
    }

}
