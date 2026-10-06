
//Java Cached Thread Pool Example
/*
It creates threads as needed and reuses previously created threads when they become available. Threads that remain idle for a while are removed from the pool.
*/
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b77 {

    public static void main(String[] args) {

        // Create Cached Thread Pool
        ExecutorService executor = Executors.newCachedThreadPool();

        // Submit 10 tasks
        for (int i = 1; i <= 10; i++) {

            int taskNumber = i;

            executor.submit(() -> {

                System.out.println(
                        "Task " + taskNumber +
                                " executed by " +
                                Thread.currentThread().getName());

                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Shutdown executor
        executor.shutdown();
    }
}

/*
                 Cached Thread Pool
                         |
              newCachedThreadPool()
                         |
              ┌──────────┴──────────┐
              ↓                     ↓
        Thread available       No thread available
              |                     |
              ↓                     ↓
         Reuse thread          Create new thread
              |                     |
              └──────────┬──────────┘
                         ↓
                       Task
*/