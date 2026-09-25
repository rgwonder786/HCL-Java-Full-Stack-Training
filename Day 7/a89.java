/*
14. Queue
A Queue generally follows FIFO:First In, First Out
ENTER
A → B → C → D - D will be used first
↑           ↑
Front       Rear

A leaves first
*/

import java.util.LinkedList;
import java.util.Queue;

public class a89 {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Rahul");
        queue.offer("Amit");
        queue.offer("Neha");

        System.out.println(queue);

        System.out.println("Front: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println(queue);
    }
}
