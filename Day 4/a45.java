// Inheritance Example
class animal {
    void get() {
        System.out.println("Hello From Animal");
    }
}

class dog extends animal {
    void set() {
        System.out.println("Hello from Dog");
    }
}

public class a45 {

    public static void main(String[] args) {

        dog obj = new dog();
        obj.get();
        obj.set();
    }
}