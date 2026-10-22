import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("Abhimanyu");
        set.add("Java");
        set.add("Set");
        set.add("Demo");
        System.out.println("insertion order is kept");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
