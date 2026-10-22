import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    public static void main(String[] args) {
        HashMap<Integer, String> emp = new HashMap<Integer, String>();
        emp.put(101, "Abhimanyu");
        emp.put(102, "Rohit");
        emp.put(103, "Kavya");
        System.out.println("101 exists? " + emp.containsKey(101));
        System.out.println("keySet");
        for (Integer k : emp.keySet()) {
            System.out.println(k + " = " + emp.get(k));
        }
        System.out.println("entrySet");
        for (Map.Entry<Integer, String> e : emp.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
