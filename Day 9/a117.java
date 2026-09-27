//Example of Garbage Collection:
public class a117 {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        person1 = null; // Now, the "John" object is eligible for garbage collection

        Person person2 = new Person("Alice");
        // "Alice" is still referenced, so it's not eligible for garbage collection
    }
}
/*
 * The Person object holding "John" is no longer referenced, so it becomes
 * eligible for garbage collection.
 * The garbage collector will eventually reclaim the memory used by "John", but
 * "Alice" is still in use.
 */