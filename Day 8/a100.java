//2. Generic Types Differ Based on their Type Arguments

class Test<T> {
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public void display() {
        System.out.println(obj);
    }
}

public class a100 {
    public static void main(String[] args) {
        Test<String> obj1 = new Test<>("Rahul");
        obj1.display();
        Test<Integer> obj2 = new Test<Integer>(111);
        obj2.display();
        //obj1 = obj2; // This results an error

    }
}
/*
 * Explanation: At compile time, Test<Integer> and Test<String> are treated as
 * different parameterized types.
 * Java generics enforce type safety during compilation, so assigning one to
 * another results in a compile-time error.
 */
