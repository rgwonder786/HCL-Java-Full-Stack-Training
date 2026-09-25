
//3. Unbounded Wildcard
/*
This wildcard type is specified using the wildcard character (?), for example, List. This is called a list of unknown types. These are useful in the following cases -

When writing a method that can be employed using functionality provided in Object class.
When the code is using methods in the generic class that doesn't depend on the type parameter
*/
import java.util.Arrays;
import java.util.List;

class a112 {
    public static void main(String[] args) {

        // Integer List
        List<Integer> list1 = Arrays.asList(1, 2, 3);

        // Double list
        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);

        printlist(list1);

        printlist(list2);
    }

    private static void printlist(List<?> list) {

        System.out.println(list);
    }
}