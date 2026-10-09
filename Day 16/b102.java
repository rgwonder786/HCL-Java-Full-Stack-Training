//Sealed || Non Sealed || Final
sealed class Car permits auto, bus {
    void display() {
        System.out.println("I am Autobot");
    }
}

non-sealed class auto extends Car {
    void get() {
        System.out.println(" i am Auto Rikshaw");
    }
}

final class bus extends Car {
    void set() {
        System.out.println("I am Car");
    }
}

class bycycle extends auto {
    void show() {
        System.out.println("Ride a ByCycle");
    }
}

// class Scooty extends Car {

// }

public class b102 {
    public static void main(String[] args) {
        auto a = new auto();
        a.display();
        a.get();

        bus b = new bus();
        b.display();
        b.set();

        bycycle b1 = new bycycle();
        b1.get();
        b1.display();
    }
}
