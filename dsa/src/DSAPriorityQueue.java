import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DSAPriorityQueue {
    public static void main(String[] args) {
        Queue<Double> queue = new LinkedList<>();

        queue.offer(3.0);
        queue.offer(2.6);
        queue.offer(8.1);
        queue.offer(9.0);
        queue.offer(7.09);
        queue.offer(1.1);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println("**********");
        // This PriorityQueue sorts based on default comparator
        Queue<Double> pQueue = new PriorityQueue<>();

        // If you want to sort the other way use a different comparator
        //Queue<Double> pQueue = new PriorityQueue<>(Collections.reverseOrder());

        pQueue.offer(3.0);
        pQueue.offer(2.6);
        pQueue.offer(8.1);
        pQueue.offer(9.0);
        pQueue.offer(7.09);
        pQueue.offer(1.1);

        while (!pQueue.isEmpty()){
            System.out.println(pQueue.poll());
        }

    }
}
