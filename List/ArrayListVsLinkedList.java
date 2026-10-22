import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();

        long t1 = System.nanoTime();
        for (int i = 0; i < 20000; i++) {
            al.add(0, i);
        }
        long t2 = System.nanoTime();
        System.out.println("ArrayList add at beginning: " + (t2 - t1));

        t1 = System.nanoTime();
        for (int i = 0; i < 20000; i++) {
            ll.add(0, i);
        }
        t2 = System.nanoTime();
        System.out.println("LinkedList add at beginning: " + (t2 - t1));

        t1 = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            al.remove(al.size() / 2);
        }
        t2 = System.nanoTime();
        System.out.println("ArrayList remove middle: " + (t2 - t1));

        t1 = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            ll.remove(ll.size() / 2);
        }
        t2 = System.nanoTime();
        System.out.println("LinkedList remove middle: " + (t2 - t1));

        t1 = System.nanoTime();
        int s = 0;
        for (Integer n : al) {
            s = s + n;
        }
        t2 = System.nanoTime();
        System.out.println("ArrayList iterate: " + (t2 - t1));

        t1 = System.nanoTime();
        s = 0;
        for (Integer n : ll) {
            s = s + n;
        }
        t2 = System.nanoTime();
        System.out.println("LinkedList iterate: " + (t2 - t1));
        System.out.println("Abhimanyu compared both lists");
    }
}
