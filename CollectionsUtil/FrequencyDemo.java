import java.util.ArrayList;
import java.util.Collections;

public class FrequencyDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Abhimanyu");
        list.add("Java");
        list.add("Abhimanyu");
        list.add("Java");
        list.add("Abhimanyu");
        System.out.println("Abhimanyu count = " + Collections.frequency(list, "Abhimanyu"));
        System.out.println("Java count = " + Collections.frequency(list, "Java"));
    }
}
