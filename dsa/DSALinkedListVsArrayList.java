package dsa;

import java.util.ArrayList;
import java.util.LinkedList;

public class DSALinkedListVsArrayList {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // ********** Linked List ************
        startTime = System.nanoTime();

        // do something
        // linkedList.get(0);
        //linkedList.getLast();
        //linkedList.removeFirst();
        //linkedList.remove(50000);
        linkedList.removeLast();
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("Linked List:\t" + elapsedTime+" ns");

        // ********** Array List ************
        startTime = System.nanoTime();

        // do something
        //arrayList.get(0);
        //arrayList.getLast();
        //arrayList.removeFirst();
        // arrayList.remove(50000);
        arrayList.removeLast();
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("Array List:\t" + elapsedTime+" ns");

    }
}
