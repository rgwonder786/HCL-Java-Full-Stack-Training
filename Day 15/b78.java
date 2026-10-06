/*
Java Single Thread Pool Example
A Single Thread Executor creates an executor with only one worker thread. Tasks are executed sequentially, in submission order, so only one task runs at a time.
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b78 {

    public static void main(String[] args) {

        // Create Single Thread Pool
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit Task 1
        executor.submit(() -> {
            System.out.println(
                    "Task 1 executed by: "
                            + Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Task 1 completed");
        });

        // Submit Task 2
        executor.submit(() -> {
            System.out.println(
                    "Task 2 executed by: "
                            + Thread.currentThread().getName());

            System.out.println("Task 2 completed");
        });

        // Submit Task 3
        executor.submit(() -> {
            System.out.println(
                    "Task 3 executed by: "
                            + Thread.currentThread().getName());

            System.out.println("Task 3 completed");
        });

        // Shutdown
        executor.shutdown();
    }
}

// Month 1 - 31 - 50,000/- Leave - 2 waiting - 5 sec
// Month 2 - 28 - 50,000/- Leave - 3
