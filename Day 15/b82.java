
/*
Future with Runnable in Java
Normally, Runnable does not return a value. However, ExecutorService.submit(Runnable) returns a Future<?> that can be used to:
- Check whether the task is complete
- Wait for completion using get()
- Cancel the task
- Detect exceptions from the task
*/
import java.util.concurrent.*;

public class b82 {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Runnable task
        Runnable task = () -> {

            System.out.println("Task started...");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Task completed...");
        };

        // Submit Runnable
        Future<?> future = executor.submit(task);

        System.out.println("Task submitted.");

        // Wait for task to complete
        future.get();

        System.out.println("Main thread: Task is completed.");

        executor.shutdown();
    }
}
/*
Runnable
   |
   | submit()
   ↓
ExecutorService
   |
   ↓
Worker Thread
   |
   | executes task
   ↓
Task completed
   |
   ↓
Future
   |
   | get()
   ↓
Main Thread continues

*/