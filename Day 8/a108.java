//Upper Bounded Type
/*
An Upper Bounded Type means:
We restrict a generic type so that it can be a particular class or any subclass of that class.
*/
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barking");
    }
}

class Test<T extends Animal> {

    T animal;
    // Animal → Upper Bound //Dog → Actual Type

    Test(T animal) {
        this.animal = animal;
    }

    void display() {
        animal.sound();
    }
}

public class a108 {
    public static void main(String[] args) {
        Test<Dog> obj = new Test<>(new Dog());
        obj.display();
    }
}
