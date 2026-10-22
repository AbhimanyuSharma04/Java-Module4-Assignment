import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        list.add("Abhimanyu");
        list.add("Java");
        Thread writer = new Thread(new Runnable() {
            public void run() {
                list.add("Module4");
            }
        });
        writer.start();
        for (String s : list) {
            System.out.println(s);
        }
        try {
            writer.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("final = " + list);
    }
}
