//5. Hybrid Inheritance
/*
Why use an interface instead of another class?
because Java does not support multiple inheritance through classes.
*/
class Vehicle { // Super Class
    void engine() {
        System.out.println("It's a Masterclass Engine");
    }
}

interface fare {
    default void fareInfo() { // This is an abstract method.
        System.out.println("The Fare in Bus is nominal");
    }
}

class maruti extends Vehicle {
    void marutiEngine() {
        System.out.println("It's V6 engine");
    }
}

class bus extends Vehicle implements fare {
    void busType() {
        System.out.println("This is bus type");
    }
}

public class a58 {

    public static void main(String[] args) {
        maruti obj = new maruti();
        obj.engine();
        obj.marutiEngine();

        bus obj1 = new bus();
        obj1.fareInfo();
        obj1.busType();
        obj1.engine();
    }
}

/*
                    Vehicle
                       |
                    engine()
                       ↑
              ┌────────┴────────┐
              │                 │
            Maruti              Bus
              │                 │
       marutiEngine()         busType()
                                │
                                │ implements
                                ↓
                              Fare
                                │
                            fareInfo()
*/