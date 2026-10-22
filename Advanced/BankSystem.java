import java.util.HashMap;

public class BankSystem {
    public static void main(String[] args) {
        HashMap<Integer, Double> acc = new HashMap<Integer, Double>();
        acc.put(1001, 5000.0);
        acc.put(1002, 2500.0);
        acc.put(1001, acc.get(1001) + 1500);
        System.out.println("Abhimanyu account 1001 = " + acc.get(1001));
        acc.put(1002, acc.get(1002) - 500);
        System.out.println("account 1002 = " + acc.get(1002));
        System.out.println(acc);
    }
}
