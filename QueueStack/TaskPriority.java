import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int compareTo(Task o) {
        return this.priority - o.priority;
    }

    public String toString() {
        return name + "(" + priority + ")";
    }
}

public class TaskPriority {
    public static void main(String[] args) {
        PriorityQueue<Task> pq = new PriorityQueue<Task>();
        pq.add(new Task("email", 3));
        pq.add(new Task("Abhimanyu homework", 1));
        pq.add(new Task("game", 5));
        System.out.println("highest priority removed: " + pq.poll());
        System.out.println("queue now: " + pq);
    }
}
