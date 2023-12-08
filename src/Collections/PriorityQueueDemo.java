package Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

//        Comparator<Integer> reverseOrder = Comparator.reverseOrder();  One way of initializing the comparator class

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.addAll(Arrays.asList(21,32,78,40,9,48,51,42,10,19232));

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.contains(32));
        System.out.println(priorityQueue);

        priorityQueue.offer(129090);
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.element());
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.remove(12));
        System.out.println(priorityQueue);




    }
}
