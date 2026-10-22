import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Rohit");
        set.add("Abhimanyu");
        set.add("Kavya");
        set.add("Abhimanyu");
        System.out.println("TreeSet sorted: " + set);
    }
}
