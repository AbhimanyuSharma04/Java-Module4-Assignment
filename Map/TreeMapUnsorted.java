import java.util.TreeMap;

public class TreeMapUnsorted {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        map.put("Rohit", 80);
        map.put("Abhimanyu", 90);
        map.put("Meena", 75);
        map.put("Kavya", 88);
        System.out.println("keys come sorted even if added unsorted");
        System.out.println(map);
    }
}
