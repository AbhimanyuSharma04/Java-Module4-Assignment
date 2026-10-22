import java.util.PriorityQueue;

public class MergePQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> q1 = new PriorityQueue<Integer>();
        q1.add(5);
        q1.add(1);
        q1.add(9);
        PriorityQueue<Integer> q2 = new PriorityQueue<Integer>();
        q2.add(4);
        q2.add(2);
        PriorityQueue<Integer> all = new PriorityQueue<Integer>(q1);
        all.addAll(q2);
        System.out.print("Abhimanyu merged: ");
        while (!all.isEmpty()) {
            System.out.print(all.poll() + " ");
        }
        System.out.println();
    }
}
