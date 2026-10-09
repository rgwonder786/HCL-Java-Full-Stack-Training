//First Virtual Thread Program
public class b106 {

    public static void main(String[] args) {

        Thread thread = Thread.startVirtualThread(() -> {

            System.out.println("Task running...");

        });

        System.out.println("Main thread running");

    }
}