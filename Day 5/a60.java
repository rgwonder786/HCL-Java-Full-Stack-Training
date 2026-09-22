//2. Runtime Polymorphism — Method Overriding
class animal {
    void sound() {
        System.out.println("Animal has Sound");
    }
}

class cat extends animal {
    @Override
    void sound() {
        System.out.println("CAT Meows");
    }
}

class dog extends animal {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class a60 {
    public static void main(String[] args) {

        animal obj;
        obj = new cat();
        obj.sound();

        obj = new dog();
        obj.sound();
    }
}
