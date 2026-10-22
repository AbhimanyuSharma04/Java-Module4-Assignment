class Pair<K, V> {
    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<Integer, String>(1, "Abhimanyu");
        System.out.println(p.getKey() + " -> " + p.getValue());
        p.setValue("Abhimanyu Sharma");
        System.out.println(p.getKey() + " -> " + p.getValue());
    }
}
