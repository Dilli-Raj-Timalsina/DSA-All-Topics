package Stack_and_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CircularQueue queue = new CircularQueue(5);
//        queue.insert(3);
//        queue.insert(6);
//        queue.insert(5);
//        queue.insert(19);
//        queue.insert(1);
//
//        queue.display();
//
//        System.out.println(queue.remove());
//        queue.insert(133);
//        queue.display();
//
//        System.out.println(queue.remove());
//        queue.insert(99);
//        queue.display();
//

//In Built Queue

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);
        queue.offer(1);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(89);
//        deque.addLast(78);


    }
}
