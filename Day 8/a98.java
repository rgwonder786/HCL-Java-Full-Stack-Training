//We can also pass multiple Type parameters in Generic classes. 
class Test<T, U> {
    T obj1;
    U obj2;

    Test(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void dispaly() {
        System.out.print("Mr." + obj2 + "'s");
        System.out.print(" Age is: " + obj1);
    }
}

public class a98 {
    public static void main(String[] args) {

        Test<Integer, String> t1 = new Test<>(15, "Rahul");
        t1.dispaly();
    }
}
