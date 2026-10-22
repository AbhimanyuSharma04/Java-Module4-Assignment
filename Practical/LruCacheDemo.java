import java.util.LinkedHashMap;
import java.util.Map;

class LruCache<K, V> extends LinkedHashMap<K, V> {
    int cap;

    LruCache(int cap) {
        super(cap, 0.75f, true);
        this.cap = cap;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > cap;
    }
}

public class LruCacheDemo {
    public static void main(String[] args) {
        LruCache<Integer, String> cache = new LruCache<Integer, String>(3);
        cache.put(1, "one");
        cache.put(2, "Abhimanyu");
        cache.put(3, "three");
        cache.get(1);
        cache.put(4, "four");
        System.out.println(cache);
    }
}
