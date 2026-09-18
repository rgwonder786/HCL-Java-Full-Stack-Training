//Getting Multiple class inTo main method
class animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}

class bird {
    void eat() {
        System.out.println("Bird Flies");
    }
}

public class a33 {

    public static void main(String[] args) {

        animal obj1 = new animal();
        obj1.sound();

        bird obj2 = new bird();
        obj2.eat();

    }
}