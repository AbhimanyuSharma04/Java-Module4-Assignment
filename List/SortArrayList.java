import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Rohit");
        names.add("Abhimanyu");
        names.add("Kavya");
        names.add("Meena");
        Collections.sort(names);
        System.out.println("A to Z: " + names);
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Z to A: " + names);
    }
}
