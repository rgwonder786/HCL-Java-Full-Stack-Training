
//Java Fixed Thread Pool Example
/*
A fixed thread pool creates a fixed number of worker threads and reuses them to execute submitted tasks.
*/
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b75 {

    public static void main(String[] args) {

        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 6 tasks
        for (int i = 1; i <= 6; i++) {

            int taskNumber = i;

            executor.submit(() -> {

                System.out.println(
                        "Task " + taskNumber +
                                " started by " +
                                Thread.currentThread().getName());

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(
                        "Task " + taskNumber +
                                " completed by " +
                                Thread.currentThread().getName());
            });
        }

        // Stop accepting new tasks
        executor.shutdown();
    }
}

/*
                Fixed Thread Pool
                       |
                3 Worker Threads
             ┌─────────┼─────────┐
             ↓         ↓         ↓
          Thread-1  Thread-2  Thread-3
             |         |         |
           Task 1    Task 2    Task 3
             |         |         |
           Task 4    Task 5    Task 6
*/