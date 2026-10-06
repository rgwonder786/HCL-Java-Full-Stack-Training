
//Java Future with get() Method
/*
Future represents the result of an asynchronous task. The get() method retrieves that result.
The important point is:
future.get() blocks the calling thread until the task completes and returns its result.
*/

import java.util.concurrent.*;

public class b80 {

    public static void main(String[] args) throws Exception {

        // Create thread pool
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit Callable task
        Future<Integer> future = executor.submit(() -> {

            System.out.println("Task started...");

            // Simulate a long-running task
            Thread.sleep(3000);

            System.out.println("Task completed...");

            return 100;
        });

        System.out.println("Task submitted.");

        // Get the result
        System.out.println("Waiting for result...");

        Integer result = future.get();

        System.out.println("Result: " + result);

        // Shutdown executor
        executor.shutdown();
    }
}
/*
Main Thread
     |
     | submit(Callable)
     ↓
ExecutorService
     |
     ↓
Worker Thread
     |
     | Task executes
     | sleep(3 seconds)
     | return 100
     ↓
Future<Integer>
     |
     | future.get()
     ↓
Main Thread
     |
     ↓
Result = 100
*/