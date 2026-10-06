
/*
Java Scheduled Thread Pool
A Scheduled Thread Pool is used when you want to execute tasks:
- After a delay
- At a fixed rate
- With a fixed delay between executions
*/
import java.util.concurrent.*;

public class b79 {

    public static void main(String[] args) {

        // Create Scheduled Thread Pool with 2 threads
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        // Task
        Runnable task = () -> {
            System.out.println(
                    "Task executed by: "
                            + Thread.currentThread().getName());
        };

        // Execute task after 5 seconds
        executor.schedule(
                task,
                5,
                TimeUnit.SECONDS);

        // Shutdown
        executor.shutdown();
    }
}