//2. Generic Method
// A generic method declares its own type parameter. The type parameter is written before the return type
// A Generic method example

public class a99 {
    // A Generic method example
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }

    public static void main(String[] args) {
        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("HCL Students");

        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}
