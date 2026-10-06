//get() with Timeout

import java.util.concurrent.*;

public class b81 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> future = executor.submit(() -> {

            Thread.sleep(5000);

            return 100;
        });

        try {

            Integer result = future.get(2, TimeUnit.SECONDS);

            System.out.println("Result: " + result);

        } catch (TimeoutException e) {

            System.out.println(
                    "Task did not finish within 2 seconds.");

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

        } catch (ExecutionException e) {

            System.out.println(
                    "Task failed: " + e.getCause());

        } finally {

            executor.shutdown();
        }
    }
}