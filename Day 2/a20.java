/*
 "for-each" Loop (Enhanced For Loop) in Java
The for-each loop (also called Enhanced For Loop) in Java is used to iterate over elements in an array or collection without needing an index variable.
It's commonly used when we don’t need to know the index of the element and simply want to process each element in the collection.
NOTE : The for-each loop (enhanced for loop) in Java is primarily used with arrays and collections, but it can also be used with any other Iterable objects also.
*/
public class a20 {

    public static void main(String[] args) {

        String fruits[] = { "Apple", "Cherry", "Banana", "Jackfruit" };
        System.out.println(fruits[0]);
        System.out.println("--------------------");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
