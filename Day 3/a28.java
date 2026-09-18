//Using Multiple Method
public class a28 {

    public void get() {

        System.out.println("I am Running");
    }

    public static void main(String[] args) {

        a28 obj = new a28();
        obj.get();
        obj.get();
        obj.set();
        obj.set();

    }

    public void set() {
        System.out.println("I am Eating");
    }

}
