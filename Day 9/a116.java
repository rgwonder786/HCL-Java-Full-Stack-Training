//Example of Heap Usage:
public class a116 {
    public static void main(String[] args) {
        Person person1 = new Person("John"); // Stored in the heap
        Person person2 = new Person("Alice"); // Stored in the heap
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name; // The String object is also in the heap
    }
}