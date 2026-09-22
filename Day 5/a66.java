//Method Overriding
class animal {
    void sound() {
        System.out.println("Animal Has Sound");
    }
}

class cat extends animal {
    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}

class dog extends animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class a66 {

    public static void main(String[] args) {

        animal obj;
        obj = new cat();
        obj.sound();

        obj = new dog();
        obj.sound();
    }
}
