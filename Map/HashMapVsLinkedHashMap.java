import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapVsLinkedHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(3, "three");
        hm.put(1, "Abhimanyu");
        hm.put(2, "two");
        System.out.println("HashMap order not promised: " + hm);

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        lhm.put(3, "three");
        lhm.put(1, "Abhimanyu");
        lhm.put(2, "two");
        System.out.println("LinkedHashMap insertion order: " + lhm);
    }
}
