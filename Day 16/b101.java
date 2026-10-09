//Sealed Class in Java

// import javax.xml.catalog.CatalogException;

sealed class Animal permits Dog, Cat {
    void sound() {
        System.out.println("Animal Sounds");
    }
}

final class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

final class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat Mewos");
    }
}

public class b101 {

    public static void main(String[] args) {
        Cat obj1 = new Cat();
        obj1.sound();

        Dog obj2 = new Dog();
        obj2.sound();
    }
}
