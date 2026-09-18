//Using Multiple Method & Multiple Object
//Also use Two Parameter
public class a30 {

    public void get(String name1) {

        System.out.println(name1 + " is Eating");
    }

    public void set(String name2) {

        System.out.println(name2 + " is Dancing");

    }

    public static void main(String[] args) {

        a30 obj1 = new a30();
        obj1.get("Rahul");
        obj1.set("Rahul");

        a30 obj2 = new a30();
        obj2.get("Raj");
        obj2.set("Raj");
    }
}
