import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class MultiMap<K, V> {
    HashMap<K, List<V>> map = new HashMap<K, List<V>>();

    void put(K k, V v) {
        if (!map.containsKey(k)) {
            map.put(k, new ArrayList<V>());
        }
        map.get(k).add(v);
    }

    List<V> get(K k) {
        return map.get(k);
    }
}

public class MultiMapDemo {
    public static void main(String[] args) {
        MultiMap<String, String> m = new MultiMap<String, String>();
        m.put("Abhimanyu", "Java");
        m.put("Abhimanyu", "Python");
        m.put("Rohit", "C++");
        System.out.println("Abhimanyu subjects = " + m.get("Abhimanyu"));
        System.out.println("Rohit subjects = " + m.get("Rohit"));
    }
}
