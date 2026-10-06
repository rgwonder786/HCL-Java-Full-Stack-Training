
//Future with Runnable and Predefined Result
/*
If you want Runnable + Future with a predefined result, there is an important point:
Runnable itself cannot return a result because run() has a void return type.

However, ExecutorService.submit(Runnable, result) lets you provide a predefined result. The returned Future will give that result through get() after the Runnable finishes.
*/
import java.util.concurrent.*;

public class b83 {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task = () -> {

            System.out.println("Task started...");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Task completed...");
        };

        // Predefined result
        String result = "Task Successfully Completed";

        // Submit Runnable with predefined result
        Future<String> future = executor.submit(task, result);

        System.out.println("Task submitted...");

        // Get predefined result
        String output = future.get();

        System.out.println("Result: " + output);

        executor.shutdown();
    }
}