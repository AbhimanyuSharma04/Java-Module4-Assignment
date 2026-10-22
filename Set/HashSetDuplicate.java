import java.util.HashSet;

public class HashSetDuplicate {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Abhimanyu");
        set.add("Rohit");
        boolean added = set.add("Abhimanyu");
        System.out.println("second Abhimanyu added? " + added);
        System.out.println("set = " + set);
        System.out.println("size = " + set.size());
    }
}
