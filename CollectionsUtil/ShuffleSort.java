import java.util.ArrayList;
import java.util.Collections;

public class ShuffleSort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Abhimanyu");
        list.add("Rohit");
        list.add("Kavya");
        list.add("Meena");
        Collections.shuffle(list);
        System.out.println("shuffled: " + list);
        Collections.sort(list);
        System.out.println("sorted: " + list);
    }
}
