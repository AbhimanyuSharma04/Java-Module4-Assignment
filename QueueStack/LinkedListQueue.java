import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Abhimanyu queue = " + q);
        System.out.println("peek = " + q.peek());
        System.out.println("poll = " + q.poll());
        System.out.println(q);
    }
}
