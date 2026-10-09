//Sealed Interface Example
sealed interface Payment
        permits CreditCard, UPI {

    void pay();
}

final class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment using Credit Card");
    }
}

final class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }
}

public class b103 {

    public static void main(String[] args) {

        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        p1.pay();
        p2.pay();
    }
}