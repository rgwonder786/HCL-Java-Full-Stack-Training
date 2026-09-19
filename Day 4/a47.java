//Statement: Super is used to refer to the parent class method.
class parent1 {
    void fop() {
        System.out.println("Parent Class Executed");
    }
}
class child1 extends parent1 {
    void foc() {
        super.fop();// By Default Provides Super Keyword
        System.out.println("Child class executed");
    }
}
public class a47 {
    public static void main(String[] args) {
        child1 obj = new child1();
        obj.foc();
        // obj.fop();
    }
}
