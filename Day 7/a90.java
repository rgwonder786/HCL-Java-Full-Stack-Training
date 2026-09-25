/*
17. PriorityQueue
PriorityQueue does not behave like a normal FIFO queue.
Elements are processed according to their priority.
By default, the smallest element has the highest priority.
*/

import java.util.PriorityQueue;

public class a90 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(50);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        pq.remove(10);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
