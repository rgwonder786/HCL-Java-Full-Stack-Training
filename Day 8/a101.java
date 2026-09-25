/*
Static Variables in Generic Classes
Due to type erasure, Java creates only one class at runtime for a generic class, regardless of the type parameter used.
This means that static members are shared across all type parameters of a generic class.
*/
class Count<T> {
    static int count = 0;

    Count() {
        count++;
    }
}

public class a101 {
    public static void main(String[] args) {
        Count<Integer> obj1 = new Count<>();
        Count<String> obj2 = new Count<>();
        Count<Double> obj3 = new Count<>();

        System.out.println(Count.count);
    }
}
