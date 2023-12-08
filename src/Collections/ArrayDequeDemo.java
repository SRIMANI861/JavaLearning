package Collections;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>(Arrays.asList("Happy Holi","Happy Birthday","Happy Diwali","Happy Morning","Happy Afternoon","Happy Evening","Happy Dusshera"));
        deque.offerLast("Happy Christmas");
        deque.offerFirst("Happy New year");
        deque.removeAll(deque);
//        System.out.println(deque.removeLast()); This will result in exception, so avoid using these methods
        System.out.println(deque.pollLast());
        //Instead of Using addFirst , addLast, removeFirst, removeLast we use offerLast,offerFirst,pollFirst,pollLast methods as they don't result in exceptions

        System.out.println(deque);


    }
}
