import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class PrintCollection {
    static <T> void printAll(Collection<T> c) {
        for (T x : c) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Abhimanyu");
        list.add("Rohit");
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(9);
        LinkedList<String> q = new LinkedList<String>();
        q.add("task1");
        q.add("task2");
        System.out.println("list");
        printAll(list);
        System.out.println("set");
        printAll(set);
        System.out.println("queue");
        printAll(q);
    }
}
