//Multiple Bounds //A type parameter can have multiple bounds.
// Multiple Bounds
// A type parameter can have multiple bounds.

interface Printable {
    void print();
}

class Person {

    void display() {
        System.out.println("Person");
    }
}

// T must extend Person AND implement Printable
class Demo<T extends Person & Printable> {

    T obj;

    Demo(T obj) {
        this.obj = obj;
    }

    void show() {
        obj.display();
        obj.print();
    }
}

// A class that satisfies both bounds
class Student extends Person implements Printable {

    @Override
    public void print() {
        System.out.println("Student Print");
    }
}

public class a109 {

    public static void main(String[] args) {

        Demo<Student> obj = new Demo<>(new Student());

        obj.show();
    }
}