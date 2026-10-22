import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                map.put(1, "Abhimanyu");
                map.put(2, "Rohit");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                map.put(3, "Kavya");
                map.put(1, "Abhimanyu Sharma");
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
        System.out.println(map);
    }
}
