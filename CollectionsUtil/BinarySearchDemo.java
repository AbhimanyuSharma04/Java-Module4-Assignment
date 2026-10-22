import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Abhimanyu");
        list.add("Kavya");
        list.add("Meena");
        list.add("Rohit");
        Collections.sort(list);
        int i = Collections.binarySearch(list, "Meena");
        System.out.println("Meena at index " + i);
        int j = Collections.binarySearch(list, "Zoya");
        System.out.println("Zoya result " + j);
    }
}
