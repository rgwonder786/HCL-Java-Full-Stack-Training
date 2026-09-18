//Using Multiple Method
public class a29 {

    public void get() {

        System.out.println("I am Running");
    }

    public static void main(String[] args) {

        a29 obj1 = new a29();
        obj1.get();
        obj1.set();
        a29 obj2 = new a29();
        obj2.get();
        obj2.set();

    }

    public void set() {
        System.out.println("I am Eating");
    }

}
