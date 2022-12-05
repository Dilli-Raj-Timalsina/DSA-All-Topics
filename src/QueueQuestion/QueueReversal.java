package QueueQuestion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
        que.add(5);
        que.add(4);
        que.add(3);
        que.add(2);
        que.add(1);
        reverse(que);
        while(!que.isEmpty())
        {
            System.out.println(que.remove());
        }

    }
    public static void reverse(Queue<Integer> que)
    {
        Stack<Integer> s=new Stack<>();
        while(!que.isEmpty())
        {
            s.push(que.remove());
        }
        while(!s.isEmpty())
        {
            que.add(s.pop());
        }
    }
    public static void reverseRec(Queue<Integer> que)
    {

    }
}
