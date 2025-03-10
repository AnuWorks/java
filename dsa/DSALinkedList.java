package dsa;

import java.util.LinkedList;

public class DSALinkedList {

    public static void main(String[] args) {
        LinkedList<String> stackLinkedList  = new LinkedList<>();

        //Let's treat out linked list as stack
        stackLinkedList.push("A");
        stackLinkedList.push("B");
        stackLinkedList.push("C");
        stackLinkedList.push("D");
        stackLinkedList.push("F");
        stackLinkedList.pop();
        System.out.println(stackLinkedList);

        //Let's treat out linked list as queue
        LinkedList<String> queueList = new LinkedList<>();
        queueList.offer("G");
        queueList.offer("H");
        queueList.offer("I");
        queueList.offer("J");
        queueList.offer("K");
        queueList.poll();
        System.out.println(queueList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("E");

        linkedList.add(3, "D");
        System.out.println(linkedList);
        linkedList.remove("B");
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

    }
}
