package dsa;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DSAQueue {
    public static void main(String[] args) {

        // Queue is an interface, so we cannot Queue Object
        // In Collections, Queue is implemented by LinkedList and PriorityQueue
        // Since priority Queue arrange elements based on certain priority, we use LinkedList in this example

       /* Summary of Queue methods
       * Insert add(e) offer(e)
       * Remove remove() poll()
       * Examine element() peek()
       * */
        // Instead of add(), remove(), element() use offer(), poll(), peek() as prior throws exception.

        Queue<String> queue = new LinkedList<>();


        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);
        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println("peek:: "+ queue.peek());
        System.out.println("Size:: "+ queue.size());
        System.out.println("Contains:: "+ queue.contains("Harold"));

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);
        // remove() throws exception but not poll(), so we use poll()
        // System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());

        //priority queue
        Queue<String> pQueue = new PriorityQueue<>(Comparator.reverseOrder());
        pQueue.offer("Anudeep");
        pQueue.offer("Priya");
        pQueue.offer("Avyukth");
        System.out.println(pQueue.peek());






    }
}
