import java.util.ArrayList;

public class ListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Abhimanyu");
        list.add("Rohit");
        list.add("Kavya");
        System.out.println("after add: " + list);

        list.remove("Rohit");
        System.out.println("after remove by value: " + list);

        list.remove(0);
        System.out.println("after remove by index: " + list);

        list.add("Meena");
        list.add("Saurabh");
        list.set(1, "Neha");
        System.out.println("after replace: " + list);
    }
}
