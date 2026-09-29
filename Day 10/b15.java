
/*
4. Supplier<T>
Purpose: Supplier is used when you want to supply/generate a value.
Takes no input
Returns one value
Main method: get()
Example: Generate Welcome Message
*/
import java.util.function.Supplier;

public class b15 {
    public static void main(String[] args) {

        Supplier<String> message = () -> "Welcome to Java Programming";

        System.out.println(message.get());
    }
}