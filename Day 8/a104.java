/*
6. Generic Methods
A method can have its own generic type.
*/
public class a104 {
    public static <T> void display(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        display("Java");
        display(100);
        display(25.5);
        display(true);

    }

}
