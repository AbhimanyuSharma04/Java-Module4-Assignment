import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> dq = new ArrayDeque<String>();
        dq.addFirst("Abhimanyu");
        dq.addLast("Rohit");
        dq.addFirst("Kavya");
        System.out.println(dq);
        System.out.println("peek first = " + dq.peekFirst());
        System.out.println("peek last = " + dq.peekLast());
        System.out.println("remove first = " + dq.removeFirst());
        System.out.println("remove last = " + dq.removeLast());
        System.out.println(dq);
    }
}
