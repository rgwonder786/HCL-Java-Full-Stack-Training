class Parent {
    Parent() {
        System.out.println("Parent default constructor");
    }

    Parent(String name) {
        System.out.println("Parent constructor: " + name);
    }

    void show() {
        System.out.println("Parent show() method");
    }

    void show(int age) {
        System.out.println("Parent show(int): age = " + age);
    }
}

class Child extends Parent {
    Child() {
        super();
    }

    Child(String name) {
        super(name);
    }

    void show(String subject) {
        System.out.println("Child show(String): subject = " + subject);
    }
}

public class a119 {
    public static void main(String[] args) {
        Child first = new Child();
        first.show();
        first.show(18);
        first.show("Java");

        Child second = new Child("Asha");
        second.show("Inheritance");
    }
}
