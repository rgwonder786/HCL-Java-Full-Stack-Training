
//Thread //Pool 2
import java.util.concurrent.*;

public class b73 {

    public static void main(String[] args) throws Exception {

        // Create thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit Callable task
        Future<Integer> f1 = executor.submit(() -> {

            try {
                System.out.println("Task started...");

                // Simulate a time-consuming task
                Thread.sleep(10000);

                System.out.println("Task completed...");

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
                System.out.println("Task interrupted");

            }

            return 10;
        });

        // Get result from Future
        System.out.println("Waiting for result...");

        System.out.println("Result: " + f1.get());

        // Shutdown executor
        executor.shutdown();
    }
}