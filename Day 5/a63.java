//Abstarction Example 1 : TV Remote
abstract class TV {
    abstract void turnOn();

    abstract void turnOff();
}

class TVRemote extends TV {
    @Override
    void turnOn() {
        System.out.println("Tv is Turn On.");

    }

    @Override
    void turnOff() {
        System.out.println("Tv is off");
    }
}

public class a63 {

    public static void main(String[] args) {

        TV remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }

}
