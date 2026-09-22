// Java Interface
interface animal {
    public void sound();

    public void eat();

}

class cat implements animal {
    public void sound() {
        System.out.println("Cat Meows");
    }

    public void eat() {
        System.out.println("Cat eats fish");
    }
}

public class a61 {
    public static void main(String[] args) {
        cat obj = new cat();
        obj.eat();
        obj.sound();
    }
}