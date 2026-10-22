import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, String> map = new WeakHashMap<String, String>();
        String k1 = new String("k1");
        String k2 = new String("k2");
        map.put(k1, "Abhimanyu");
        map.put(k2, "data");
        System.out.println("before gc: " + map);
        k1 = null;
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("after gc: " + map);
    }
}
