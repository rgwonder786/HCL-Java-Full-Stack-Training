//THread Pull Executer

import java.util.concurrent.*;

public class b74 {

    public static void main(String[] args) {

        // 1. Core pool size
        int corePoolSize = 2;

        // 2. Maximum pool size
        int maximumPoolSize = 4;

        // 3. Keep-alive time
        long keepAliveTime = 10;

        // 4. Time unit
        TimeUnit timeUnit = TimeUnit.SECONDS;

        // 5. Work queue
        BlockingQueue<Runnable> workQueue =
                new ArrayBlockingQueue<>(2);

        // 6. Thread factory
        ThreadFactory threadFactory =
                Executors.defaultThreadFactory();

        // 7. Rejected execution handler
        RejectedExecutionHandler handler =
                new ThreadPoolExecutor.AbortPolicy();

        try (// Create ThreadPoolExecutor
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                timeUnit,
                workQueue,
                threadFactory,
                handler
        )) {
            // Submit tasks
            for (int i = 1; i <= 6; i++) {

                final int taskNumber = i;

                executor.execute(() -> {

                    System.out.println(
                            "Task " + taskNumber +
                            " executed by " +
                            Thread.currentThread().getName()
                    );

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }

            // Shutdown executor
            executor.shutdown();
        }
    }
}