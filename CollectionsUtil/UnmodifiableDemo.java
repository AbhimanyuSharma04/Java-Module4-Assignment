import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Abhimanyu");
        list.add("Java");
        List<String> safe = Collections.unmodifiableList(list);
        System.out.println(safe);
        try {
            safe.add("new");
        } catch (UnsupportedOperationException e) {
            System.out.println("cannot modify unmodifiable list");
        }
    }
}
