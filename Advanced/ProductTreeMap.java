import java.util.Map;
import java.util.TreeMap;

public class ProductTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> products = new TreeMap<String, Double>();
        products.put("Mouse", 499.0);
        products.put("Keyboard", 899.0);
        products.put("Adapter", 299.0);
        products.put("Abhimanyu USB", 199.0);
        System.out.println("sorted by name");
        for (Map.Entry<String, Double> e : products.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
