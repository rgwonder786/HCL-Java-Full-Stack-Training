//Thread //Pool 1

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b72 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        // ExecutorService - class
        // executor - Reference Var.
        // Executors - Utility Class
        // Now Number of Task 5
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " is Performed by " + Thread.currentThread().getName());
            });
        }
    }
}
