import java.util.LinkedList;
import java.util.Queue;

public class TicketQueue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("Abhimanyu");
        q.add("Rohit");
        q.add("Kavya");
        while (!q.isEmpty()) {
            System.out.println("booking ticket for " + q.poll());
        }
    }
}
