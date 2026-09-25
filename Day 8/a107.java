/*
9. Bounded Types
Sometimes we don't want a generic type to accept every possible class.
For example, suppose a method should work only with numbers.
*/
public class a107 {
    public static <T extends Number> double multiply(T value) {
        double n = value.doubleValue();
        return n * n;
    }

    public static void main(String[] args) {
        System.out.println(multiply(10));
        System.out.println(multiply(5.5));
        System.out.println(multiply(5.55f));
    }
}
