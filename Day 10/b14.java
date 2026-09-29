
/*
3. Consumer<T>
Purpose: Consumer is used when you want to perform an operation on a value.
Takes one input
Returns nothing
Main method: accept()
Example: Print Student Name
*/
import java.util.function.Consumer;

public class b14 {
    public static void main(String[] args) {

        Consumer<String> printName = name -> System.out.println("Student: " + name);

        printName.accept("Rahul");
        printName.accept("Amit");
    }
}