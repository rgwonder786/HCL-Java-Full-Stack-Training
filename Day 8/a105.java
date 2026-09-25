// Generic Method with Two Parameters
public class a105 {

    public static <T, U> void display(T t, U u) {
        System.out.println("THe value of t: " + t);
        System.out.println("The value of u: " + u);
    }

    public static void main(String[] args) {
        display(101, "Rahul");
        display(102, "Raj");
    }
}
