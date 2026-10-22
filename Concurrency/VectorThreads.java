import java.util.Vector;

public class VectorThreads {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    v.add(i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    v.add(i);
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Abhimanyu vector size = " + v.size());
    }
}
