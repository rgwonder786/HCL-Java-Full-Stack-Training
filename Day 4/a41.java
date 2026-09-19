//THis refers to current class constructor
public class a41 {

    a41() {
        this(41);
        System.out.println("Constructor 1 Executed");
    }

    a41(int r) {
        this("Rahul");
        System.out.println("Constrcutor 2 Executed: " + r);
    }

    a41(String s) {
        System.out.println("Constructor 3 Executed " + s);
    }

    public static void main(String[] args) {

        new a41();
    }
}
