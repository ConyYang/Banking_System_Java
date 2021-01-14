package DataStructure.queueeexample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> myqueue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            myqueue.add(i);
        }
        System.out.println("Element in the queue: "+myqueue);

        int removed = myqueue.remove();
        System.out.println("Removed element: "+removed);

        int top = myqueue.peek();
        System.out.println("Top element is: "+top);

        System.out.println("Element in the queue: "+myqueue);

    }
}
